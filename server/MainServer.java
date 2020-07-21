import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Vector;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Vector;


import java.io.Serializable;
import java.util.Arrays;
import java.io.Serializable;

class AllUserDataDTO extends RequestCode implements Serializable {

	private Client[] waitingRoomUserList;

	public AllUserDataDTO(int code, Client[] waitingRoomUserList) {
		super(code);
		this.waitingRoomUserList = waitingRoomUserList;
	}

	public Client[] getWaitingRoomUserList() {
		return waitingRoomUserList;
	}

	public void setWaitingRoomUserList(Client[] waitingRoomUserList) {
		this.waitingRoomUserList = waitingRoomUserList;
	}
}




class ChattingRoomInfo {
	private Client roomHost;
	private int roomNumber;
	private String roomTitle;
	private String roomPassword;
	private int roomCurrentCount;
	private int roomLimitCount;
	private Client[] userList;

	private int userNumber;

	public ChattingRoomInfo(int limitCount) {
		this.roomLimitCount = limitCount;
		userList = new Client[roomLimitCount];
	}

	public Client getRoomHost() {
		return roomHost;
	}

	public void setRoomHost(Client roomHost) {
		this.roomHost = roomHost;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomTitle() {
		return roomTitle;
	}

	public void setRoomTitle(String roomTitle) {
		this.roomTitle = roomTitle;
	}

	public String getRoomPassword() {
		return roomPassword;
	}

	public void setRoomPassword(String roomPassword) {
		this.roomPassword = roomPassword;
	}

	public int getRoomCurrentCount() {
		return roomCurrentCount;
	}

	public void setRoomCurrentCount(int roomCurrentCount) {
		this.roomCurrentCount = roomCurrentCount;
	}

	public int getRoomLimitCount() {
		return roomLimitCount;
	}

	public void setRoomLimitCount(int roomLimitCount) {
		this.roomLimitCount = roomLimitCount;
	}

	public Client[] getUserList() {
		return userList;
	}

	public void setUserList(Client[] userList) {
		this.userList = userList;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	
	public void addUser(Client client) {
		userList[userNumber] = client;
		roomCurrentCount++;
		userNumber++;
	}

	// 유저 리턴
	public Client[] returnClient() {
		Client[] list = new Client[userNumber];

		for (int i = 0; i < list.length; i++) {
			list[i] = userList[i];
		}

		return list;
	}

	// 유저삭제
	public Client removeUser(String nickName) {
		Client temp = null;

		int n = searchUserNumber(nickName);

		if (n != -1) {
			temp = userList[n];
			userList[n] = null;
			for (int i = n + 1; i < userNumber; i++) {
				if (userList[i] != null) {
					userList[i - 1] = userList[i];
				}
			}
		}
		if (temp != null) {
			roomCurrentCount--;
			userNumber--;
		}

		return temp;
	}

	// 유저 찾기
	public Client searchUser(String nickName) {

		for (int i = 0; i < roomCurrentCount; i++) {
			String userNickName = userList[i].getNickName();
			if (nickName.equals(userNickName)) {
				return userList[i];
			}
		}
		return null;
	}

	// 유저 번호 검색
	public int searchUserNumber(String nickName) {
		for (int i = 0; i < roomCurrentCount; i++) {
			String userNickName = userList[i].getNickName();
			if (nickName.equals(userNickName)) {
				return i;
			}
		}
		return -1;
	}

	// 배열 재 배치
	public void relocate(int newLimitCount) {
		userList = Arrays.copyOf(userList, newLimitCount);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof String[]) {
			String[] data = (String[]) obj;
			int number = Integer.parseInt(data[0]);
			return (roomNumber == number) && (roomTitle.equals(data[1]));
		}

		return false;
	}

}




class ChattingRoomInfoDTO extends RequestCode implements Serializable {
	private int roomNumber;
	private String roomTitle;
	private String roomPassword;
	private int roomCurrentCount;
	private int roomLimitCount;

	public ChattingRoomInfoDTO(int code, int RoomNumber, String roomTitle, String roomPassword, int roomLimitCount) {
		super(code);
		this.roomNumber = RoomNumber;
		this.roomTitle = roomTitle;
		this.roomPassword = roomPassword;
		this.roomLimitCount = roomLimitCount;
	}

	public int getRoomCurrentCount() {
		return roomCurrentCount;
	}

	public void setRoomCurrentCount(int roomCurrentCount) {
		this.roomCurrentCount = roomCurrentCount;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getRoomTitle() {
		return roomTitle;
	}

	public String getRoomPassword() {
		return roomPassword;
	}

	public int getRoomLimitCount() {
		return roomLimitCount;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setRoomTitle(String roomTitle) {
		this.roomTitle = roomTitle;
	}

	public void setRoomPassword(String roomPassword) {
		this.roomPassword = roomPassword;
	}

	public void setRoomLimitCount(int roomLimitCount) {
		this.roomLimitCount = roomLimitCount;

	}

}


class ChattingRoomSubInfo implements Serializable {
	private int roomNumber;
	private String roomTitle;
	private int roomCurrentCount;
	private int roomLimitCount;
	private String roomPassword;
	private Client host;

	public ChattingRoomSubInfo(int roomNumber, String roomTitle, int roomCurrentCount, int roomLimitCount) {
		super();
		this.roomNumber = roomNumber;
		this.roomTitle = roomTitle;
		this.roomCurrentCount = roomCurrentCount;
		this.roomLimitCount = roomLimitCount;
	}
	
	public ChattingRoomSubInfo(int roomNumber, String roomTitle, int roomLimitCount) {
		super();
		this.roomNumber = roomNumber;
		this.roomTitle = roomTitle;

		this.roomLimitCount = roomLimitCount;
	}

	public String getRoomPassword() {
		return roomPassword;
	}

	public void setRoomPassword(String roomPassword) {
		this.roomPassword = roomPassword;
	}

	public Client getHost() {
		return host;
	}

	public void setHost(Client host) {
		this.host = host;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomTitle() {
		return roomTitle;
	}

	public void setRoomTitle(String roomTitle) {
		this.roomTitle = roomTitle;
	}

	public int getRoomCurrentCount() {
		return roomCurrentCount;
	}

	public void setRoomCurrentCount(int roomCurrentCount) {
		this.roomCurrentCount = roomCurrentCount;
	}

	public int getRoomLimitCount() {
		return roomLimitCount;
	}

	public void setRoomLimitCount(int roomLimitCount) {
		this.roomLimitCount = roomLimitCount;
	}
}



class Client implements Serializable{

	private static final long serialVersionUID = 3118369580740818064L;
	private String nickName;
	private String gender;
	
	public Client() {
		
	}
	public Client(String nickName, String gender) {
		super();
		this.nickName = nickName;
		this.gender = gender;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}	
	@Override
	public boolean equals(Object obj) {
		String subNickName = (String) obj;
		
		return nickName.equals(subNickName);
	}
}

class DataDTO extends RequestCode implements Serializable {

	private Object[] data;

	public DataDTO(int code, Object... data) {
		super(code);
		this.data = data;

	}

	public Object[] getData() {
		return data;
	}

	public void setData(Object[] data) {
		this.data = data;
	}

}


class DataResponseFalseException extends RuntimeException implements Serializable{
	private int code = ResponseProtocol.RESPONSE_ALL_USER_DATA_NO;
	public DataResponseFalseException() {
		super("요청한 데이터를 전송하지 못했습니다");
	}
}


class NickNameOverlapException extends RuntimeException implements Serializable{

	private static final long serialVersionUID = -4073731244463616172L;
	int code = ResponseProtocol.RESPONSE_NICK_CHECK_NO;

	public NickNameOverlapException(String nickName) {
		super(nickName + "는 이미 사용 중 입니다.");
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return super.getMessage();
	}
	
}


class NotDeliveredException extends RuntimeException implements Serializable {
	int code = ResponseProtocol.RESPONSE_CHATTINGROOM_MSG_INPUT_NO;

	public NotDeliveredException() {
		super("입력받은 내용을 전달하지 못 함.");
	}
}

class PushDataDTO extends RequestCode implements Serializable {

	private static final long serialVersionUID = 2600312406139558193L;
	private Object data;
	
	public PushDataDTO(int code, Object data) {
		super(code);
		this.data=data;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data){
		this.data=data;
	}
}


class RandomJoinFauilureException extends RuntimeException implements Serializable{
	public RandomJoinFauilureException() {
		super("랜덤 입장에 실패하였습니다.");
	}

}

abstract class RequestCode implements Serializable {
	private static final long serialVersionUID = 196359676881917616L;
	private int code;

	public RequestCode() {
	}

	public RequestCode(int code) {

		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}


class RequestProtocol {

	public static final int REQUEST_NICK_CHECK = 100;
	public static final int REQUEST_ENTER_CHATTINGROOM = 120;
	public static final int REQUEST_RANDOM_ENTER_CHATTINGROOM = 130;
	public static final int REQUEST_CREATE_CHATTINGROOM = 140;
	public static final int REQUEST_WATINGROOM_MSG_INPUT = 160;
	public static final int REQUEST_MASTER_ENTRUST = 200;
	public static final int REQUEST_MASTER_ENTRUST_RECEIVE = 201;
	public static final int REQUEST_MASTER_ENTRUST_NOT_RECEIVE = 202;
	public static final int REQUEST_CHANGE_SETTING_ROOM = 220;
	public static final int REQUEST_CHATTINGROOM_EXIT = 230;
	public static final int REQUEST_CHATTINGROOM_HOST_EXIT = 231;
	public static final int REQUEST_CHATTINGROOM_MSG_INPUT = 240;
	public static final int REQUEST_ALL_USER_DATA = 250;
	public static final int REQUEST_SEARCH_USER = 260;
	public static final int REQUEST_USER_INVITE = 270;
	public static final int REQUEST_USER_INVITE_ACCEPT = 271;
	public static final int REQUEST_USER_INVITE_NOT_ACCEPT = 272;
	public static final int REQUEST_USER_FORCED_EXIT = 280;
	public static final int REQUEST_WHISPER = 300;
	public static final int REQUEST_USER_OUT = 444;

}



class ResponseProtocol {
	public static final int RESPONSE_NICK_CHECK_OK = 1000;
	public static final int RESPONSE_NICK_CHECK_NOTIFY = 1101;
	public static final int RESPONSE_NICK_CHECK_NO = 1102;

	public static final int RESPONSE_ENTER_CHATTINGROOM_OK = 1120;
	public static final int RESPONSE_ENTER_CHATTINGROOM_NOTIFY = 1121;
	public static final int RESPONSE_ENTER_CHATTINGROOM_UPDATE = 1122;
	public static final int RESPONSE_ENTER_CHATTINGROOM_UI_UPDATE = 1123;
	
	public static final int RESPONSE_RANDOM_ENTER_CHATTINGROOM_OK = 1130;
	public static final int RESPONSE_RANDOM_ENTER_CHATTINGROOM_NOTIFY = 1131;
	public static final int RESPONSE_RANDOM_ENTER_CHATTINGROOM_NO = 1132;
	public static final int RESPONSE_RANDOM_ENTER_CHATTINGROOM_UPDATE_UI = 1133;
	
	public static final int RESPONSE_CREATE_CHATTINGROOM_OK = 1140;
	public static final int RESPONSE_CREATE_CHATTINGROOM_NO = 1141;
	
	public static final int RESPONSE_WATING_MSG_INPUT_NO = 1160;
	public static final int RESPONSE_WATINGROOM_MSG_INPUT_OK = 1161;
	
	public static final int RESPONSE_MASTER_ENTRUST_OK = 1200;
	public static final int RESPONSE_MASTER_ENTRUST_OK_NOTIFY = 1201;
	public static final int RESPONSE_MASTER_ENTERUST_NO = 1202;
	public static final int RESPONSE_MASTER_ENTRUST_DELIVERY = 1203;
	public static final int RESPONSE_MASTER_RELEASE = 1204;
	
	public static final int RESPONSE_CHANGE_SETTING_ROOM_NO = 1221;
	public static final int RESPONSE_CHANGE_SETTING_ROOM_NOTIFY = 1222;
	public static final int RESPONSE_DUE_TO_SETTING_ROOM_WAITINGROOM_UPDATE = 1223;
	
	public static final int RESPONSE_CHATTINGROOM_EXIT_OK = 1230;
	public static final int RESPONSE_CHATTINGROOM_NOTIFY = 1231;
	public static final int RESPONSE_CHATTINGROOM_EXPLOSION = 1232;
	public static final int RESPONSE_DUE_TO_EXPLOSION_WAITINGROOM_UPDATE = 1233;
	
	public static final int RESPONSE_CHATTINGROOM_MSG_INPUT_OK = 1240;
	public static final int RESPONSE_CHATTINGROOM_MSG_INPUT_NO = 1241;
	
	public static final int RESPONSE_ALL_USER_DATA_OK = 1250;
	public static final int RESPONSE_ALL_USER_DATA_NO = 1251;
	
	public static final int RESPONSE_SEARCH_USER_OK = 1260;
	public static final int RESPONSE_SEARCH_USER_NO = 1261;
	
	public static final int RESPONSE_USER_INVITE_DELIVERY_OK = 1270;
	public static final int RESPONSE_DUE_TO_USER_INVITE_WAITINGROOM_UPDATE = 1271;
	
	public static final int RESPONSE_USER_INVITE_NOTIFY = 1272;
	public static final int RESPONSE_USER_INVITE_DELIVERY_NO = 1273;
	public static final int RESPONSE_USER_INVITE_DELIVERY = 1274;
	public static final int RESPONSE_USER_INVITE_DELIVERY_FALSE = 1275;
	
	public static final int RESPONSE_USER_FORCED_EXIT_OK = 1280;
	public static final int RESPONSE_USER_FORCED_EXIT_NOTIFY = 1281;
	public static final int RESPONSE_USER_FORCED_EXIT_NO = 1282;
	
	public static final int RESPONSE_WHISPER_OK = 1301;
	public static final int RESPONSE_WHISPER_NO = 1302;
	
	public static final int RESPONSE_USER_OUT_OK = 4444;
	public static final int RESPONSE_USER_OUT_UPDATE = 4445;
	
}



class RoomCreateFailureException extends RuntimeException {

	private static final long serialVersionUID = -6049451322225179842L;
	int code = ResponseProtocol.RESPONSE_CREATE_CHATTINGROOM_NO;

	public RoomCreateFailureException() {
		super("방 생성에 실패하였습니다.");
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return super.getMessage();
	}

}


class RoomUserListDTO extends RequestCode implements Serializable{
	
	private Client[] userList;
	
	public RoomUserListDTO(int code,Client[] userList) {
		super(code);
		this.userList = userList;
	}

	public Client[] getUserList() {
		return userList;
	}

	public void setUserList(Client[] userList) {
		this.userList = userList;
	}
	
	
}



class ServerListener extends Thread {
	private HashMap<Client, ObjectOutputStream> clientList;
	private Vector<ChattingRoomInfo> roomList;
	private WaitingRoomUserList waitingRoomUserList;

	private ObjectInputStream ois;
	private ObjectOutputStream oos;

	private static String filter;
	private Socket clientSocket;
	private boolean stopFlag;

	// 생성자
	public ServerListener(HashMap<Client, ObjectOutputStream> clientList, Vector<ChattingRoomInfo> roomList,
			WaitingRoomUserList waitingRoomUserList, Socket clientSocket) {

		this.clientList = clientList;
		this.roomList = roomList;
		this.waitingRoomUserList = waitingRoomUserList;
		this.clientSocket = clientSocket;

		try {
			ois = new ObjectInputStream(clientSocket.getInputStream());
			oos = new ObjectOutputStream(clientSocket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream("message.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));

			filter = br.readLine();

			br.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 클라이언트 생성
	private void createClient(PushDataDTO pushDataDTO) {

		String[] clientData = (String[]) pushDataDTO.getData();

		// 닉네임 , 성별
		String clientNickName = clientData[0];
		String gender = clientData[1];

		// 닉네임 중복 체크
		if (nickCheck(clientNickName)) {
			try {
				// 만약 닉네임이 존재 할 경우
				oos.writeObject(new NickNameOverlapException(clientNickName));
				oos.flush();
				oos.reset();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

			// 클라이언트 생성
			Client client = new Client(clientNickName, gender);

			synchronized (waitingRoomUserList) {
				// 대기실 유저 1명 추가
				waitingRoomUserList.addClient(client);
			}

			synchronized (clientList) {
				// 클라이언트 추가
				clientList.put(client, oos);
			}

			// RESPONSE_NICK_CHECK_OK
			WaitingRoomUpdateDTO data = returnWaitingRoomUpdateDTO(ResponseProtocol.RESPONSE_NICK_CHECK_OK);

			try {
				if (data != null) {
					oos.writeObject(data);
					oos.flush();
					oos.reset();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			// Thread 의 닉네임을 클라이언트 닉네임으로 설정한다.
			setName(clientNickName);

			Client[] waitingUserList = waitingRoomUserList.returnClient();
			try {
				data.setCode(ResponseProtocol.RESPONSE_NICK_CHECK_NOTIFY);
				if (data != null && waitingUserList != null) {
					for (int i = 0; i < waitingUserList.length; i++) {
						if (waitingUserList[i].equals(clientNickName) == false) {
							ObjectOutputStream tempOos = clientList.get(waitingUserList[i]);

							tempOos.writeObject(data);
							tempOos.flush();
							tempOos.reset();
						}
					}

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// 대기실 채팅방 목록, 사용자 목록을 만들어서 리턴
	private WaitingRoomUpdateDTO returnWaitingRoomUpdateDTO(int code) {
		Client[] userList = waitingRoomUserList.returnClient();
		int roomSize = roomList.size();
		ChattingRoomSubInfo[] chattingRoomSubInfo = new ChattingRoomSubInfo[roomList.size()];
		for (int i = 0; i < roomSize; i++) {
			ChattingRoomInfo temp = roomList.get(i);

			chattingRoomSubInfo[i] = new ChattingRoomSubInfo(temp.getRoomNumber(), temp.getRoomTitle(),
					temp.getRoomCurrentCount(), temp.getRoomLimitCount());
			chattingRoomSubInfo[i].setRoomPassword(temp.getRoomPassword());
		}
		WaitingRoomUpdateDTO data = new WaitingRoomUpdateDTO(code, userList, chattingRoomSubInfo);

		return data;
	}

	// 닉네임 중복체크
	private synchronized boolean nickCheck(String nickName) {
		Set<Client> clients = clientList.keySet();

		Iterator<Client> itr = clients.iterator();

		while (itr.hasNext()) {
			Client temp = itr.next();
			if (temp.equals(nickName)) {
				return true;
			}
		}
		return false;
	}

	// 대기실 메세지 보내기
	private boolean msgSend(PushDataDTO pushDataDTO) {
		String nickName = getName();
		Client[] temp = waitingRoomUserList.returnClient();
		String msg = (String) pushDataDTO.getData();
		String result = msg.replaceAll(filter, "*");
		String data = "[" + nickName + "]" + " : " + result;

		pushDataDTO.setCode(ResponseProtocol.RESPONSE_WATINGROOM_MSG_INPUT_OK);
		pushDataDTO.setData(data);
		synchronized (clientList) {
			for (int i = 0; i < temp.length; i++) {
				ObjectOutputStream tempOos = clientList.get(temp[i]);
				if (tempOos != null) {
					try {
						tempOos.writeObject(pushDataDTO);
						tempOos.flush();
						tempOos.reset();
					} catch (IOException e) {
						e.printStackTrace();
						return false;
					}
				}
			}
			return true;
		}
	}

	// 채팅방 메세지 보내기
	private boolean roomMsgSend(PushDataDTO pushDataDTO) {

		String nickName = getName();

		Client client = null;

		// 메세지
		String data = msgChange(nickName, pushDataDTO);
		pushDataDTO.setCode(ResponseProtocol.RESPONSE_CHATTINGROOM_MSG_INPUT_OK);

		for (int i = 0; i < roomList.size(); i++) {
			ChattingRoomInfo chattingRoomInfo = roomList.get(i);

			client = chattingRoomInfo.searchUser(nickName);
			if (client != null) {
				Client[] userList = chattingRoomInfo.getUserList();

				pushDataDTO.setData(data);

				int count = chattingRoomInfo.getUserNumber();
				for (int idx = 0; idx < count; idx++) {
					try {
						ObjectOutputStream tempOos = clientList.get(userList[idx]);
						tempOos.writeObject(pushDataDTO);
						tempOos.flush();
						tempOos.reset();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				return true;
			}
		}

		return false;
	}

	// 채팅방 생성
	private synchronized void createRoom(ChattingRoomInfoDTO chattingRoomInfoDTO) {
		String clientNickName = getName();
		Client host = waitingRoomUserList.getClient(clientNickName);
		if (host != null) {
			int limitCount = chattingRoomInfoDTO.getRoomLimitCount();

			ChattingRoomInfo chattingRoomInfo = new ChattingRoomInfo(limitCount);

			int ranDomRoomNumber = 0;
			for (ChattingRoomInfo temp : roomList) {
				int num = temp.getRoomNumber();
				ranDomRoomNumber = (int) (Math.random() * 100) + 1;
				if (num != ranDomRoomNumber) {
					break;
				}
			}

			String roomTitle = chattingRoomInfoDTO.getRoomTitle();
			String roomPassword = chattingRoomInfoDTO.getRoomPassword();

			chattingRoomInfo.setRoomHost(host);
			chattingRoomInfo.setRoomNumber(ranDomRoomNumber);
			chattingRoomInfo.setRoomTitle(roomTitle);
			chattingRoomInfo.setRoomPassword(roomPassword);
			chattingRoomInfo.setRoomCurrentCount(0);

			roomList.add(chattingRoomInfo);

			waitingRoomUserList.removeClient(host);

			chattingRoomInfo.addUser(host);

			ChattingRoomSubInfo[] chattingRoomSubInfoList = new ChattingRoomSubInfo[roomList.size()];
			for (int i = 0; i < roomList.size(); i++) {
				ChattingRoomInfo temp = roomList.get(i);
				chattingRoomSubInfoList[i] = new ChattingRoomSubInfo(temp.getRoomNumber(), temp.getRoomTitle(),
						temp.getUserNumber(), temp.getRoomLimitCount());
				chattingRoomSubInfoList[i].setRoomCurrentCount(temp.getRoomCurrentCount());
				chattingRoomSubInfoList[i].setRoomPassword(temp.getRoomPassword());
			}

			ChattingRoomSubInfo chattingRoomSubInfo = new ChattingRoomSubInfo(ranDomRoomNumber, roomTitle, limitCount);
			chattingRoomSubInfo.setRoomCurrentCount(1);
			chattingRoomSubInfo.setRoomPassword(roomPassword);
			chattingRoomSubInfo.setHost(host);

			try {
				ObjectOutputStream oosTemp = clientList.get(host);
				oosTemp.writeObject(chattingRoomSubInfo);
				oosTemp.flush();
				oosTemp.reset();
			} catch (Exception e) {
				e.printStackTrace();
			}

			waitRoomUpdate(ResponseProtocol.RESPONSE_CREATE_CHATTINGROOM_OK);
		} else {

			try {
				oos.writeObject(new RoomCreateFailureException());
				oos.flush();
				oos.reset();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	// 채팅방 입장
	private synchronized void joinRoom(ChattingRoomInfoDTO chattingRoomDTO) {
		String nickName = getName();

		String requestRoomNumber = String.valueOf(chattingRoomDTO.getRoomNumber());
		String requestRoomTitle = chattingRoomDTO.getRoomTitle();

		String[] data = new String[2];
		data[0] = requestRoomNumber;
		data[1] = requestRoomTitle;

		Client client = null;
		for (ChattingRoomInfo chattingRoomInfo : roomList) {
			if (chattingRoomInfo.equals(data)) {
				client = waitingRoomUserList.getClient(nickName);

				chattingRoomInfo.addUser(client);

				waitingRoomUserList.removeClient(client);

				Client[] userListTemp = chattingRoomInfo.returnClient();

				ChattingRoomSubInfo subInfo = returnRoomInfo(chattingRoomInfo);
				System.out.println("호스트 : " + chattingRoomInfo.getRoomHost().getNickName());
				try {
					DataDTO dataDTO = new DataDTO(ResponseProtocol.RESPONSE_ENTER_CHATTINGROOM_OK, subInfo,
							userListTemp);
					oos.writeObject(dataDTO);
					oos.flush();
					oos.reset();
				} catch (IOException e) {
					e.printStackTrace();
				}

				try {
					String msg = nickName + "님이 입장하였습니다..";
					for (int i = 0; i < userListTemp.length; i++) {
						String name = userListTemp[i].getNickName();
						if (name.equals(nickName) == false) {
							ObjectOutputStream tempOos = clientList.get(userListTemp[i]);

							tempOos.writeObject(new DataDTO(ResponseProtocol.RESPONSE_ENTER_CHATTINGROOM_NOTIFY,
									userListTemp, msg));

							tempOos.flush();
							tempOos.reset();
						} else {
							System.out.println("????????! " + nickName);
						}
					}

				} catch (IOException e1) {
					e1.printStackTrace();
				}

				// 대기실 유저 목록
				Client[] userList = waitingRoomUserList.returnClient();

				if (userList != null) {
					try {
						WaitingRoomUpdateDTO waitingRoomUpdateDTO = returnWaitingRoomUpdateDTO(
								ResponseProtocol.RESPONSE_ENTER_CHATTINGROOM_UPDATE);
						for (int i = 0; i < userList.length; i++) {
							ObjectOutputStream tempOos = clientList.get(userList[i]);

							tempOos.writeObject(waitingRoomUpdateDTO);
							tempOos.flush();
							tempOos.reset();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
				break;
			}
		}
	}

	private String roomJoinMsg(String nickName) {
		String msg = nickName + "님이 들어왔습니다.";
		return msg;
	}

	private String roomOutMsg(String nickName) {
		String msg = nickName + "님이 나가셨습니다.";
		return msg;
	}

	private String roomSettingChangeMsg() {
		String msg = "방 설정이 변경되었습니다.";
		return msg;
	}

	private String msgChange(String nickName, PushDataDTO pushDataDTO) {

		String msg = ((String) pushDataDTO.getData()).replaceAll(filter, "♥");
		String data = "[" + nickName + "]" + " : " + msg;

		return data;
	}

	// 랜덤 입장
	private boolean randomJoinRoom() {

		String nickName = getName();
		Client client = null;
		int roomSize = roomList.size();

		if (roomSize != 0) {
			client = waitingRoomUserList.getClient(nickName);

			int randomNumber = (int) (Math.random() * roomSize);

			ChattingRoomInfo info = roomList.get(randomNumber);

			int roomCurrentCount = info.getRoomCurrentCount();
			int roomLimitCount = info.getRoomLimitCount();

			if (info.getRoomPassword().equals("") && roomCurrentCount < roomLimitCount) {
				synchronized (waitingRoomUserList) {
					waitingRoomUserList.removeClient(client);
				}

				info.addUser(client);

				Client[] temp = info.returnClient();
				ChattingRoomSubInfo subInfo = returnRoomInfo(info);
				try {
					DataDTO dataDTO = new DataDTO(ResponseProtocol.RESPONSE_RANDOM_ENTER_CHATTINGROOM_OK, subInfo,
							temp);

					oos.writeObject(dataDTO);
					oos.flush();
					oos.reset();

				} catch (Exception e) {
					e.printStackTrace();
				}

				try {
					for (int i = 0; i < temp.length; i++) {
						if (temp[i].equals(nickName) == false) {
							ObjectOutputStream tempOos = clientList.get(temp[i]);
							tempOos.writeObject(new DataDTO(ResponseProtocol.RESPONSE_RANDOM_ENTER_CHATTINGROOM_NOTIFY,
									temp, roomJoinMsg(nickName)));
							tempOos.flush();
							tempOos.reset();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				waitRoomUpdate(ResponseProtocol.RESPONSE_RANDOM_ENTER_CHATTINGROOM_UPDATE_UI);
				return true;
			}
		}

		return false;
	}

	// 대기실의 모든 유저를 리턴해서 돌려준다.
	private AllUserDataDTO returnAllUserData() {
		Client[] allUserList = waitingRoomUserList.returnClient();
		if (allUserList != null) {
			AllUserDataDTO allUserDataDTO = new AllUserDataDTO(ResponseProtocol.RESPONSE_ALL_USER_DATA_OK, allUserList);

			return allUserDataDTO;
		}
		return null;
	}

	// 채팅방에서 찾아서 삭제함
	private synchronized Client roomSearchClient(String nickName) {
		for (ChattingRoomInfo info : roomList) {

			Client client = info.removeUser(nickName);

			if (client != null) {
				// RESPONSE_CHATTINGROOM_NOTIFY
				try {
					Client[] userList = info.returnClient();

					// 나가셨습니다 메세지
					String msg = roomOutMsg(nickName);

					for (int i = 0; i < userList.length; i++) {
						ObjectOutputStream tempOos = clientList.get(userList[i]);

						tempOos.writeObject(new DataDTO(ResponseProtocol.RESPONSE_CHATTINGROOM_NOTIFY, userList, msg));
						tempOos.flush();
						tempOos.reset();
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

				return client;
			}
		}
		return null;
	}

	// 채팅방 나가기
	private Client exitChattingRoom() {
		String nickName = getName();

		// 채팅방에서 찾아서 삭제함
		Client client = roomSearchClient(nickName);

		// 대기실에 추가
		waitingRoomUserList.addClient(client);

		// 해당 클라이언트 리턴
		return client;
	}

	// 방 설정 변경
	private void roomSettingChange(ChattingRoomInfoDTO chattingRoomInfoDTO) {

		int roomNumber = chattingRoomInfoDTO.getRoomNumber();
		String roomTitle = chattingRoomInfoDTO.getRoomTitle();
		String roomPassword = chattingRoomInfoDTO.getRoomPassword();
		int currentCount = chattingRoomInfoDTO.getRoomCurrentCount();
		int limitCount = chattingRoomInfoDTO.getRoomLimitCount();

		// 채팅방의 정보를 이용해서 찾은거 리턴받음
		ChattingRoomInfo info = searchRoom(roomNumber, roomTitle);

		if (info != null) {
			if (currentCount <= limitCount) {

				info.setRoomTitle(roomTitle);
				info.setRoomPassword(roomPassword);
				info.setRoomLimitCount(limitCount);

				// 제한인원 만큼 배열을 다시 만든다.
				info.relocate(limitCount);

				// RESPONSE_CHANGE_SETTING_ROOM_NOTIFY
				Client[] list = info.returnClient();
				String msg = roomSettingChangeMsg();

				ChattingRoomSubInfo subInfo = new ChattingRoomSubInfo(roomNumber, info.getRoomTitle(),
						info.getRoomCurrentCount(), info.getRoomLimitCount());
				subInfo.setRoomPassword(roomPassword);

				for (int i = 0; i < list.length; i++) {
					try {
						ObjectOutputStream tempOos = clientList.get(list[i]);

						tempOos.writeObject(
								new DataDTO(ResponseProtocol.RESPONSE_CHANGE_SETTING_ROOM_NOTIFY, subInfo, msg));

						tempOos.flush();
						tempOos.reset();

					} catch (IOException e) {
						e.printStackTrace();
					}

				}

				// RESPONSE_DUE_TO_SETTING_ROOM_WAITINGROOM_UPDATE
				// 대기실 인원이 없을 경우에는 전송하지 않음.
				waitRoomUpdate(ResponseProtocol.RESPONSE_DUE_TO_SETTING_ROOM_WAITINGROOM_UPDATE);

			} else {
				// RESPONSE_CHANGE_SETTING_ROOM_NO
				try {
					oos.writeObject(new PushDataDTO(ResponseProtocol.RESPONSE_CHANGE_SETTING_ROOM_NO, "인원 수를 확인 하세요"));
					oos.flush();
					oos.reset();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}

	// 대기실 업데이트
	private void waitingRoomUpdate(String nickName) {
		// RESPONSE_DUE_TO_EXPLOSION_WAITINGROOM_UPDATE
		Client[] userList = waitingRoomUserList.returnClient();
		WaitingRoomUpdateDTO data = returnWaitingRoomUpdateDTO(
				ResponseProtocol.RESPONSE_DUE_TO_EXPLOSION_WAITINGROOM_UPDATE);
		if (userList != null) {
			for (int i = 0; i < userList.length; i++) {
				if (userList[i].equals(nickName) != true) {
					ObjectOutputStream tempOos = clientList.get(userList[i]);
					try {
						tempOos.writeObject(data);
						tempOos.flush();
						tempOos.reset();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	// 귓속말 기능
	private void whisper(PushDataDTO pushDataDTO) {
		String msg = (String) pushDataDTO.getData();

		int start = msg.indexOf(" ") + 1;
		int end = msg.indexOf(" ", start);

		if (end != -1) {
			String to = msg.substring(start, end);
			String msg2 = "귓속말 FROM[" + getName() + "] : " + msg.substring(end + 1);

			Client toClient = searchUser(to);
			if (toClient != null) {
				ObjectOutputStream tempOos = clientList.get(toClient);
				if (tempOos != null) {
					PushDataDTO data = null;
					try {
						data = new PushDataDTO(ResponseProtocol.RESPONSE_WHISPER_OK, msg2);
						tempOos.writeObject(data);
						tempOos.flush();
						tempOos.reset();
					} catch (IOException e) {
						e.printStackTrace();
					}

					try {
						String msg3 = "귓속말 TO[" + to + "] : " + msg.substring(end + 1);
						data.setData(msg3);
						oos.writeObject(data);
						oos.flush();
						oos.reset();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} else {
				// RESPONSE_WHISPER_NO
				try {
					oos.writeObject(new PushDataDTO(ResponseProtocol.RESPONSE_WHISPER_NO, "귓속말 전송에 실패함."));
					oos.flush();
					oos.reset();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 유저 찾기
	public Client searchUser(String nickName) {
		Client temp = null;
		// 대기실에서 찾기
		temp = waitingRoomUserList.searchUser(nickName);
		if (temp != null) {
			return temp;
		}

		// 채팅방에서 찾기
		for (ChattingRoomInfo info : roomList) {
			temp = info.searchUser(nickName);
			if (temp != null) {
				return temp;
			}
		}

		return null;
	}

	// 채팅방 찾기
	public ChattingRoomInfo searchRoom(int roomNumber, String roomTitle) {

		String[] str = new String[2];

		str[0] = String.valueOf(roomNumber);
		str[1] = roomTitle;

		for (int i = 0; i < roomList.size(); i++) {
			ChattingRoomInfo info = roomList.get(i);
			int num = info.getRoomNumber();
			if (num == roomNumber) {
				return info;
			}
		}

		return null;
	}

	// 채팅방 폭파
	private void explosionRoom() {
		String nickName = getName();
		Client temp = null;
		int idx = 0;

		for (ChattingRoomInfo info : roomList) {
			temp = info.searchUser(nickName);
			if (temp != null) {
				Client[] userList = info.returnClient();

				for (int i = 0; i < userList.length; i++) {
					Client user = info.removeUser(userList[i].getNickName());
					ObjectOutputStream tempOos = clientList.get(userList[i]);

					try {

						tempOos.writeObject(new PushDataDTO(ResponseProtocol.RESPONSE_CHATTINGROOM_EXPLOSION,
								"방장이 무책임하게 나가서 방이 폭파 되었습니다."));
						tempOos.flush();
						tempOos.reset();

					} catch (Exception e) {
						e.printStackTrace();
					}
					// 대기실에 추가
					waitingRoomUserList.addClient(user);
				}
				// 채팅방 삭제
				roomList.remove(idx);

				// 대기실 인원들
				Client[] waitingUser = waitingRoomUserList.returnClient();

				WaitingRoomUpdateDTO dto = returnWaitingRoomUpdateDTO(
						ResponseProtocol.RESPONSE_DUE_TO_EXPLOSION_WAITINGROOM_UPDATE);
				if (waitingUser != null) {
					for (int i = 0; i < waitingUser.length; i++) {
						ObjectOutputStream tempOos = clientList.get(waitingUser[i]);

						try {
							tempOos.writeObject(dto);
							tempOos.flush();
							tempOos.reset();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					break;
				}
			}
			idx++;
		}
	}

	// 초대 대상에게 메세지를 보낸다.
	private void inviteClient(PushDataDTO pushDataDTO) {
		String nickName = getName();
		String inviteTo = (String) pushDataDTO.getData();
		Client to = waitingRoomUserList.searchUser(inviteTo);
		if (to != null) {
			try {
				ObjectOutputStream tempOos = clientList.get(to);
				tempOos.writeObject(new PushDataDTO(ResponseProtocol.RESPONSE_USER_INVITE_DELIVERY, nickName));
				tempOos.flush();
				tempOos.reset();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				oos.writeObject(new PushDataDTO(ResponseProtocol.RESPONSE_USER_INVITE_DELIVERY_FALSE,
						"유저가 종료했거나, 이미 다른 채팅방에 들어갔을지도 모릅니다"));
				oos.flush();
				oos.reset();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 초대수락
	private boolean inviteAccept(PushDataDTO pushDataDTO) {
		// RESPONSE_USER_INVITE_DELIVERY_OK
		String hostNickName = (String) pushDataDTO.getData();
		String nickName = getName();

		for (ChattingRoomInfo info : roomList) {
			Client host = info.getRoomHost();
			String name = host.getNickName();
			if (name.equals(hostNickName)) {
				int currentCount = info.getRoomCurrentCount();
				int limitCount = info.getRoomLimitCount();

				// 현재인원 < 제한인원
				System.out.println("현재인원 " + currentCount + "\t제한인원 " + limitCount);
				if (currentCount < limitCount) {
					Client client = waitingRoomUserList.searchUser(nickName);
					waitingRoomUserList.removeClient(client);

					info.addUser(client);

					Client[] userList = info.returnClient();
					ChattingRoomSubInfo subInfo = returnRoomInfo(info);
					try {
						ObjectOutputStream tempOos = clientList.get(client);
						DataDTO dataDTO = new DataDTO(ResponseProtocol.RESPONSE_USER_INVITE_DELIVERY_OK, subInfo,
								userList);

						tempOos.writeObject(dataDTO);
						tempOos.flush();
						tempOos.reset();
					} catch (Exception e) {
						e.printStackTrace();
					}

					String msg = roomJoinMsg(nickName);
					for (int i = 0; i < userList.length; i++) {
						String nick = userList[i].getNickName();
						if (nick.equals(nickName) == false) {
							ObjectOutputStream tempOos = clientList.get(userList[i]);
							try {
								tempOos.writeObject(
										new DataDTO(ResponseProtocol.RESPONSE_USER_INVITE_NOTIFY, userList, msg));
								tempOos.flush();
								tempOos.reset();
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
					// RESPONSE_USER_INVITE_NOTIFY
					waitRoomUpdate(ResponseProtocol.RESPONSE_DUE_TO_USER_INVITE_WAITINGROOM_UPDATE);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void run() {
		Object obj = null;

		try {
			while ((obj = ois.readObject()) != null) {
				if (obj instanceof PushDataDTO) {
					PushDataDTO pushDataDTO = (PushDataDTO) obj;
					int code = pushDataDTO.getCode();
					if (code == RequestProtocol.REQUEST_NICK_CHECK) {
						// 클라이언트 생성
						createClient(pushDataDTO);
					} else if (code == RequestProtocol.REQUEST_WATINGROOM_MSG_INPUT) {
						// 대기실 메세지 전송
						boolean result = msgSend(pushDataDTO);
						if (!result) {
							// RESPONSE_WATINGROOM_MSG_INPUT_NO
						}
					} else if (code == RequestProtocol.REQUEST_CHATTINGROOM_MSG_INPUT) {
						roomMsgSend(pushDataDTO);
					} else if (code == RequestProtocol.REQUEST_WHISPER) {
						// 귓속말
						whisper(pushDataDTO);
					} else if (code == RequestProtocol.REQUEST_USER_INVITE) {
						// 대기실 유저 초대 요청
						inviteClient(pushDataDTO);
					} else if (code == RequestProtocol.REQUEST_USER_INVITE_ACCEPT) {
						// 초대를 받는다
						boolean result = inviteAccept(pushDataDTO);
					} else if (code == RequestProtocol.REQUEST_MASTER_ENTRUST) {
						// ENTRUST_DELIVERY
						entrustDelivery(pushDataDTO);
					} else if (code == RequestProtocol.REQUEST_MASTER_ENTRUST_RECEIVE) {
						entrustReceive(pushDataDTO);
					} else if (code == RequestProtocol.REQUEST_MASTER_ENTRUST_NOT_RECEIVE) {
						String host = (String) pushDataDTO.getData();
						String msg = getName() + "님이 방장 위임을 거절하였습니다.";

						Client clientHost = searchUser(host);

						ObjectOutputStream tempOos = clientList.get(clientHost);
						tempOos.writeObject(new PushDataDTO(ResponseProtocol.RESPONSE_MASTER_ENTERUST_NO, msg));
						tempOos.flush();
						tempOos.reset();
					} else if (code == RequestProtocol.REQUEST_USER_FORCED_EXIT) {
						// 강제 퇴장 요청 처리
						kickUser(pushDataDTO);
					}
				} else if (obj instanceof ChattingRoomInfoDTO) {

					ChattingRoomInfoDTO chattingRoomInfoDTO = (ChattingRoomInfoDTO) obj;
					int code = chattingRoomInfoDTO.getCode();
					if (code == RequestProtocol.REQUEST_CREATE_CHATTINGROOM) {
						// 채팅방 생성
						createRoom(chattingRoomInfoDTO);
					} else if (code == RequestProtocol.REQUEST_ENTER_CHATTINGROOM) {
						// 채팅방 입장
						joinRoom(chattingRoomInfoDTO);
					} else if (code == RequestProtocol.REQUEST_CHANGE_SETTING_ROOM) {
						// 채팅방 정보 변경
						roomSettingChange(chattingRoomInfoDTO);
					}
				} else if (obj instanceof Integer) {
					int n = (int) obj;
					// 랜덤 입장
					if (n == RequestProtocol.REQUEST_RANDOM_ENTER_CHATTINGROOM) {
						boolean result = randomJoinRoom();
						// 랜덤입장 실패할 경우
						if (!result) {
							oos.writeObject(new PushDataDTO(ResponseProtocol.RESPONSE_RANDOM_ENTER_CHATTINGROOM_NO,
									"랜덤 입장 할 수가 없습니다."));
							oos.flush();
							oos.reset();
						}

					} else if (n == RequestProtocol.REQUEST_ALL_USER_DATA) {
						// 대기실 모든 유저 데이터 요청
						AllUserDataDTO allUserDataDTO = returnAllUserData();
						if (allUserDataDTO != null) {
							oos.writeObject(allUserDataDTO);
							oos.flush();
							oos.reset();
						} else {
							// ResponseProtocol.RESPONSE_ALL_USER_DATA_NO;
							oos.writeObject(
									new PushDataDTO(ResponseProtocol.RESPONSE_ALL_USER_DATA_NO, "대기실에 유저가 아무도 없습니다."));
							oos.flush();
							oos.reset();
						}

					} else if (n == RequestProtocol.REQUEST_CHATTINGROOM_EXIT) {
						String userNickName = getName();

						Client client = exitChattingRoom();

						if (client != null) {
							// RESPONSE_CHATTINGROOM_EXIT_OK data :
							// WaitingRoomUpdateDTO
							WaitingRoomUpdateDTO data = returnWaitingRoomUpdateDTO(
									ResponseProtocol.RESPONSE_CHATTINGROOM_EXIT_OK);
							try {
								oos.writeObject(data);
								oos.flush();
								oos.reset();
							} catch (IOException e) {
								e.printStackTrace();
							}

							waitingRoomUpdate(userNickName);
						}
					} else if (n == RequestProtocol.REQUEST_CHATTINGROOM_HOST_EXIT) {
						explosionRoom();
					} else if (n == RequestProtocol.REQUEST_USER_OUT) {
						userExit();
					}
				} else if (obj instanceof DataDTO) {
					DataDTO dataDTO = (DataDTO) obj;
					int code = dataDTO.getCode();
					if (code == RequestProtocol.REQUEST_USER_INVITE_NOT_ACCEPT) {
						String user = (String) dataDTO.getData()[0];
						String host = (String) dataDTO.getData()[1];

						String msg = user + "님이 초대를 거절하였습니다.";

						Client hostClient = searchUser(host);
						// RESPONSE_USER_INVITE_DELIVERY_NO
						ObjectOutputStream tempOos = clientList.get(hostClient);

						tempOos.writeObject(new PushDataDTO(ResponseProtocol.RESPONSE_USER_INVITE_DELIVERY_NO, msg));
						tempOos.flush();
						tempOos.reset();
					}
				}

			}
		} catch (SocketException e) {
			if (stopFlag != true) {
				forcedExit();
			}
			return;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	// 강제 퇴장
	private void kickUser(PushDataDTO pushDataDTO) {
		// 강제 퇴장할 대상
		String user = (String) pushDataDTO.getData();

		String host = getName();
		// 채팅방 찾기
		ChattingRoomInfo info = returnChattingRoom(host);
		if (info != null) {
			// 채팅방에서 해당 유저를 삭제
			Client kickUser = info.removeUser(user);
			if (kickUser == null) {
				// 강퇴 실패 했을 경우 RESPONSE_USER_FORCED_EXIT_NO
				try {
					oos.writeObject(new PushDataDTO(ResponseProtocol.RESPONSE_USER_FORCED_EXIT_NO, "강퇴에 실패하였습니다"));
					oos.flush();
					oos.reset();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return;
			} else {
				waitingRoomUserList.addClient(kickUser);

				// 해당 유저에게 대기실 채팅방 목록, 사용자 목록을 전달한다
				WaitingRoomUpdateDTO data = returnWaitingRoomUpdateDTO(ResponseProtocol.RESPONSE_USER_FORCED_EXIT_OK);

				ObjectOutputStream tempOos = clientList.get(kickUser);

				try {
					tempOos.writeObject(data);
					tempOos.flush();
					tempOos.reset();
				} catch (Exception e) {
					e.printStackTrace();
				}

				// 채팅방에 있는 모든 클라이언트에게 전달
				Client[] list = info.returnClient();
				ChattingRoomSubInfo infoData = returnRoomInfo(info);
				String msg = user + "님이 강퇴당했습니다";
				DataDTO dataDTO = new DataDTO(ResponseProtocol.RESPONSE_USER_FORCED_EXIT_NOTIFY, list, msg);
				for (int i = 0; i < list.length; i++) {
					ObjectOutputStream listTemp = clientList.get(list[i]);
					try {
						listTemp.writeObject(dataDTO);
						listTemp.flush();
						listTemp.reset();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

	// 채팅방 찾아서 리턴
	private ChattingRoomInfo returnChattingRoom(String nickName) {
		for (int i = 0; i < roomList.size(); i++) {
			ChattingRoomInfo info = roomList.get(i);

			Client host = info.getRoomHost();
			if (host.getNickName().equals(nickName)) {
				return info;
			}
		}
		return null;
	}

	private void entrustReceive(PushDataDTO pushDataDTO) {
		String userNick = getName();
		String hostNick = (String) pushDataDTO.getData();

		for (int i = 0; i < roomList.size(); i++) {
			ChattingRoomInfo info = roomList.get(i);

			String host = info.getRoomHost().getNickName();
			if (hostNick.equals(host)) {
				Client user = info.searchUser(userNick);
				if (user != null) {
					info.setRoomHost(user);

					// 채팅방 사용자들에게 알림
					Client[] list = info.returnClient();
					String message = host + "님에서" + userNick + "님으로 방장이 변경되었습니다.";
					DataDTO dataDTO = new DataDTO(ResponseProtocol.RESPONSE_MASTER_ENTRUST_OK_NOTIFY, list, user,
							message);
					for (int index = 0; index < list.length; index++) {
						ObjectOutputStream tempOos = clientList.get(list[index]);
						try {
							tempOos.writeObject(dataDTO);
							tempOos.flush();
							tempOos.reset();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					break;
				}
			}
		}
	}

	private void entrustDelivery(PushDataDTO pushDataDTO) {
		String deliveryUser = (String) pushDataDTO.getData();
		Client deliveryClient = searchUser(deliveryUser);

		ObjectOutputStream tempOos = clientList.get(deliveryClient);
		try {
			tempOos.writeObject(
					new DataDTO(ResponseProtocol.RESPONSE_MASTER_ENTRUST_DELIVERY, getName(), "방장을 받으시겠습니까?"));
			tempOos.flush();
			tempOos.reset();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 채팅방의 모든 정보를 리턴
	private ChattingRoomSubInfo returnRoomInfo(ChattingRoomInfo info) {
		ChattingRoomSubInfo subInfo = new ChattingRoomSubInfo(info.getRoomNumber(), info.getRoomTitle(),
				info.getRoomCurrentCount(), info.getRoomLimitCount());

		subInfo.setHost(info.getRoomHost());
		subInfo.setRoomPassword(info.getRoomPassword());

		return subInfo;
	}

	// 대기실에서 정상종료
	private void userExit() {
		synchronized (this) {
			Client client = waitingRoomUserList.searchUser(getName());
			if (client != null) {
				waitingRoomUserList.removeClient(client);

				try {
					oos.writeObject(new Integer(ResponseProtocol.RESPONSE_USER_OUT_OK));
					oos.flush();
					oos.reset();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				clientList.remove(client);
				waitRoomUpdate(ResponseProtocol.RESPONSE_USER_OUT_UPDATE);
			}
			stopFlag = true;
		}
	}

	// 강제종료 했을 때 실행할 메소드
	private void forcedExit() {
		synchronized (this) {
			String name = getName();
			Client client = waitingRoomUserList.searchUser(name);
			if (client != null) {
				waitingRoomUserList.removeClient(client);
				clientList.remove(client);

				// 대기실 유저 업데이트
				waitRoomUpdate(ResponseProtocol.RESPONSE_USER_OUT_UPDATE);
			}
			int idx = 0;
			for (ChattingRoomInfo info : roomList) {
				Client user = info.searchUser(name);
				if (user != null) {
					Client host = info.getRoomHost();
					if (host.getNickName().equals(name)) {
						Client[] userList = info.getUserList();
						// 방장일 때 강제 종료
						for (int i = 0; i < userList.length; i++) {
							if (userList[i] != null) {
								Client deleteUser = info.removeUser(userList[i].getNickName());
								try {
									if (host.getNickName().equals(deleteUser.getNickName()) == false) {
										ObjectOutputStream tempOos = clientList.get(userList[i]);
										tempOos.writeObject(
												new PushDataDTO(ResponseProtocol.RESPONSE_CHATTINGROOM_EXPLOSION,
														"방장이 무책임하게 나가서 방이 폭파 되었습니다."));
										tempOos.flush();
										tempOos.reset();

										// 대기실에 추가
										waitingRoomUserList.addClient(deleteUser);
									}

								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}
						// 채팅방 삭제
						roomList.remove(idx);

						// 대기실 인원들
						Client[] waitingUser = waitingRoomUserList.returnClient();

						WaitingRoomUpdateDTO dto = returnWaitingRoomUpdateDTO(
								ResponseProtocol.RESPONSE_DUE_TO_EXPLOSION_WAITINGROOM_UPDATE);
						if (waitingUser != null) {
							for (int i = 0; i < waitingUser.length; i++) {
								ObjectOutputStream tempOos = clientList.get(waitingUser[i]);

								try {
									tempOos.writeObject(dto);
									tempOos.flush();
									tempOos.reset();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
							break;
						}

					} else {
						// 클라이언트 일 때 강제 종료
						// 채팅방에서 삭제
						info.removeUser(name);

						// 채팅방 유저에게 알리기 RESPONSE_CHATTINGROOM_NOTIFY
						Client[] list = info.getUserList();

						String msg = roomOutMsg(name);

						for (int i = 0; i < list.length; i++) {
							ObjectOutputStream tempOos = clientList.get(list[i]);
							try {
								tempOos.writeObject(
										new DataDTO(ResponseProtocol.RESPONSE_CHATTINGROOM_NOTIFY, list, msg));
								tempOos.flush();
								tempOos.reset();
							} catch (Exception e) {
								e.printStackTrace();
							}

						}
						// 대기실 목록 업데이트
						waitRoomUpdate(ResponseProtocol.RESPONSE_DUE_TO_EXPLOSION_WAITINGROOM_UPDATE);
					}
				}
				idx++;
			}

		}
	}


	private void waitRoomUpdate(int code) {
		WaitingRoomUpdateDTO data = returnWaitingRoomUpdateDTO(code);
		Client[] list = waitingRoomUserList.returnClient();
		if (list != null) {
			for (int i = 0; i < list.length; i++) {
				ObjectOutputStream tempOos = clientList.get(list[i]);

				try {
					tempOos.writeObject(data);
					tempOos.flush();
					tempOos.reset();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}


class WaitingRoomUpdateDTO extends RequestCode implements Serializable {

	private Client[] waitingRoomUserList;
	private ChattingRoomSubInfo[] chattingRoomSubInfo;

	public WaitingRoomUpdateDTO(int code, Client[] waitingRoomUserList, ChattingRoomSubInfo[] chattingRoomSubInfo) {
		super(code);
		this.waitingRoomUserList = waitingRoomUserList;
		this.chattingRoomSubInfo = chattingRoomSubInfo;
	}

	public Client[] getWaitingRoomUserList() {
		return waitingRoomUserList;
	}

	public void setWaitingRoomUserList(Client[] waitingRoomUserList) {
		this.waitingRoomUserList = waitingRoomUserList;
	}

	public ChattingRoomSubInfo[] getChattingRoomSubInfo() {
		return chattingRoomSubInfo;
	}

	public void setChattingRoomSubInfo(ChattingRoomSubInfo[] chattingRoomSubInfo) {
		this.chattingRoomSubInfo = chattingRoomSubInfo;
	}

}




class WaitingRoomUserList {
	private int capacity;
	private int size;
	private Client[] waitingUser;

	public WaitingRoomUserList() {
		size = -1;
		capacity = 10;
		waitingUser = new Client[capacity];
	}

	public Client[] getWaitingUser() {
		return waitingUser;
	}

	public void setWaitingUser(Client[] waitingUser) {
		this.waitingUser = waitingUser;
	}

	public int getSize() {
		return size;
	}

	public void addClient(String nickName, String gender) {
		if (size >= capacity) {
			reallocate();
		}

		waitingUser[size + 1] = new Client(nickName, gender);
		size++;
	}

	public void addClient(Client client) {
		if (size+1 >= capacity) {
			reallocate();
		}
		waitingUser[size + 1] = client;
		size++;
	}

	public void removeClient(Client client) {
		String subNickName = client.getNickName();
		int n = searchClient(subNickName);
		if (n != -1) {
			waitingUser[n] = null;
			for (int i = n + 1; i <= size; i++) {
				if (waitingUser[i] != null) {
					waitingUser[i - 1] = waitingUser[i];
				}
			}
			size--;
		}
	}

	private int searchClient(String nickName) {
		int i = 0;
		for (i = 0; i <= size; i++) {
			if (waitingUser[i].equals(nickName)) {
				return i;
			}
		}
		return -1;
	}

	public Client searchUser(String nickName) {
		int n = searchClient(nickName);
		if (n != -1) {
			return waitingUser[n];
		}
		return null;
	}

	private void reallocate() {
		capacity *= 2;
		System.out.println(capacity);
		waitingUser = Arrays.copyOf(waitingUser, capacity);
	}

	public Client getClient(String nickName) {
		int n = searchClient(nickName);
		if (n != -1) {
			return waitingUser[n];
		} else {
			return null;
		}
	}

	public Client[] returnClient() {
		if (size == -1) {
			return null;
		}

		Client[] temp = new Client[size + 1];

		for (int i = 0; i <= size; i++) {
			temp[i] = waitingUser[i];
		}
		return temp;
	}
}



public class MainServer {
	private HashMap<Client, ObjectOutputStream> clientList;
	private Vector<ChattingRoomInfo> roomList;
	private WaitingRoomUserList waitingRoomUserList;

	public MainServer() {
		clientList = new HashMap<Client, ObjectOutputStream>();
		roomList = new Vector<ChattingRoomInfo>();
		waitingRoomUserList = new WaitingRoomUserList();
	}

	public void serverConn(Socket clientSocket) {
		ServerListener sl = new ServerListener(clientList, roomList, waitingRoomUserList, clientSocket);
		sl.start();
	}

	public static void main(String[] args) throws ConnectException, SocketTimeoutException {

		MainServer ms = new MainServer();
		Socket clientSocket = null;
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(10008);
			while (true) {
				synchronized (serverSocket) {
					clientSocket = serverSocket.accept();

					ms.serverConn(clientSocket);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}