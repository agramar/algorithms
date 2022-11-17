package io.github.agramar.algorithm.kakao.test2019;

import java.util.List;

public class ChatRoom {

	private final int MAX_RECORD_LENGTH = 100000;
	private final int MIN_RECORD_LENGTH = 1;
	private final int MAX_USER_ID_LENGTH = 10;
	private final int MIN_USER_ID_LENGTH = 1;
	private final int MAX_NICKNAME_LENGTH = 10;
	private final int MIN_NICKNAME_LENGTH = 1;

	private List<Action> actionRecords;
	private List<User> users;

	public void doAction(String action) {
		action.split(" ");
	}

	private void dispatchAction(String action) throws Exception {
		if (action.equals("Enter")) {

		} else if (action.equals("Leave")) {

		} else if (action.equals("Change")) {

		} else {
			throw new IllegalArgumentException("can't do action!!");
		}
	}

	private void enterChatRoom(String userId) throws Exception {
		
	}

	private void leaveChatRoom(String userId) throws Exception  {
		
	}

	private void changeNickName(String userId, String nickname) throws Exception {
		
	}
}
