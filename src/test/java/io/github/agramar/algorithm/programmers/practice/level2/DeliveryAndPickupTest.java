package io.github.agramar.algorithm.programmers.practice.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryAndPickupTest {

    DeliveryAndPickup deliveryAndPickup = new DeliveryAndPickup();

    @Test
    void testCase1() {
        int cap = 4;
        int n = 5;
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};

        long result = deliveryAndPickup.solution(cap, n, deliveries, pickups);

        assertEquals(16, result);
    }

    @Test
    void testCase2() {
        int cap = 2;
        int n = 7;
        int[] deliveries = {1, 0, 2, 0, 1, 0, 2};
        int[] pickups = {0, 2, 0, 1, 0, 2, 0};

        long result = deliveryAndPickup.solution(cap, n, deliveries, pickups);

        assertEquals(30, result);
    }
}