package io.github.agramar.algorithm.programmers.practice.level2;

import java.util.*;

public class PathCycleOfLight {

    public int[] solution(String[] grid) {

        Command[][] coordinates = createCoordinates(grid);

        List<Integer> answers = new ArrayList<>();
        Set<int[]> path = createPathTreeSet();
        int maxX = coordinates[0].length - 1;
        int maxY = coordinates.length - 1;
        for (int x = 0; x < coordinates[0].length; x++) {
            for (int y = 0; y < coordinates.length; y++) {
                int[] start = {x, y};
                for (Direction direction : Direction.values()) {
                    int[] cursor = {x, y};
                    Direction cursorDirection = direction;
                    int count = 0;
                    while (true) {
                        int[] pathElements = {cursor[1], cursor[0], cursorDirection.ordinal()};
                        if (path.contains(pathElements)) {
                            break;
                        }

                        count++;
                        path.add(pathElements);
                        cursor = cursorDirection.move(cursor, maxX, maxY);
                        cursorDirection = coordinates[cursor[1]][cursor[0]].turnTo(cursorDirection);

                        if (Arrays.equals(cursor, start) && direction == cursorDirection) {
                            answers.add(count);
                            break;
                        }
                    }
                }
            }
        }

        return answers.stream()
                .mapToInt(value -> value)
                .sorted()
                .toArray();
    }

    private Set<int[]> createPathTreeSet() {
        return new TreeSet<>((x, y) -> {
            for (int i = 0; i < x.length; i++) {
                if ((x[i] != y[i]) && (x[i] > y[i])) {
                    return 1;
                }
                if ((x[i] != y[i]) && (x[i] <= y[i])) {
                    return -1;
                }
            }
            return 0;
        });
    }

    private Command[][] createCoordinates(String[] grid) {
        Command[][] coordinates = new Command[grid.length][grid[0].length()];
        for (int y = 0; y < grid.length; y++) {
            String[] element = grid[y].split("");
            for (int x = 0; x < element.length; x++) {
                coordinates[y][x] = Command.valueOf(element[x]);
            }
        }
        return coordinates;
    }

    enum Command {
        S {
            @Override
            Direction turnTo(Direction from) {
                return from;
            }
        },
        L {
            @Override
            Direction turnTo(Direction from) {
                return switch (from) {
                    case EAST -> Direction.NORTH;
                    case WEST -> Direction.SOUTH;
                    case SOUTH -> Direction.EAST;
                    case NORTH -> Direction.WEST;
                };
            }
        },
        R {
            @Override
            Direction turnTo(Direction from) {
                return switch (from) {
                    case EAST -> Direction.SOUTH;
                    case WEST -> Direction.NORTH;
                    case SOUTH -> Direction.WEST;
                    case NORTH -> Direction.EAST;
                };
            }
        };


        abstract Direction turnTo(Direction from);
    }

    enum Direction {
        EAST {
            @Override
            int[] move(int[] from, int maxX, int maxY) {
                int x = from[0] + 1;
                int y = from[1];
                return new int[]{x <= maxX ? x : 0, y};
            }
        },
        WEST {
            @Override
            int[] move(int[] from, int maxX, int maxY) {
                int x = from[0] - 1;
                int y = from[1];
                return new int[]{x >= 0 ? x : maxX, y};
            }
        },
        SOUTH {
            @Override
            int[] move(int[] from, int maxX, int maxY) {
                int x = from[0];
                int y = from[1] + 1;
                return new int[]{x, y <= maxY ? y : 0};
            }
        },
        NORTH {
            @Override
            int[] move(int[] from, int maxX, int maxY) {
                int x = from[0];
                int y = from[1] - 1;
                return new int[]{x, y >= 0 ? y : maxY};
            }
        };

        abstract int[] move(int[] from, int maxX, int maxY);
    }
}
