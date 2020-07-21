import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Arrays;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Color;

import java.io.Serializable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.awt.Color;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.net.Socket;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.omg.CORBA.portable.ServantObject;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.io.Serializable;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.bind.SchemaOutputResolver;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


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



class ChattingRoomFrame extends JFrame {
	// 호스트
	private Client host;

	private JButton btnUserMenu;
	private JButton btnChatRoomSetting;
	private JButton btnClose;
	private JTextArea taChat;
	private JTextField tfInput;
	private JButton btnSend;

	private JPanel pnlUserIn;
	private ObjectOutputStream oos;
	private int currentC;
	private int limitC;
	private int roomNum;
	private String roomTitle;
	private String password;
	private CreatRoomDialog crd;
	// 현재 클라이언트
	private String myName;

	public void setHost(Client host) {
		this.host = host;
	}

	public Client getHost() {
		return host;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public String getPassword() {
		return password;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public String getRoomTitle() {
		return roomTitle;
	}

	public void setRoomTitle(String roomTitle) {
		this.roomTitle = roomTitle;
	}

	public ChattingRoomFrame() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}
		init();
		setDisplay();
		addListeners();
		showFrame();
	}

	public ChattingRoomFrame(int roomNum, String roomTitle) {
		this();
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}
		this.roomNum = roomNum;
		this.roomTitle = roomTitle;

	}

	public ChattingRoomFrame(int currentC, int limitC, int roomNum, String roomTitle, ObjectOutputStream oos) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}
		this.currentC = currentC;
		this.limitC = limitC;
		this.roomNum = roomNum;
		this.roomTitle = roomTitle;
		this.oos = oos;
		init();
		setDisplay();
		addListeners();
		showFrame();
	}

	public void addTfInput(String tfInput) {
		this.tfInput.setText(tfInput);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setLimitC(int limitC) {
		this.limitC = limitC;
	}

	public int getLimitC() {
		return limitC;
	}

	public void setDispose() {
		dispose();
	}

	public int getCurrentC() {
		return currentC;
	}

	public void setCurrentC(int currentC) {
		this.currentC = currentC;
	}

	public void setChattingRoom(String title, int currentC, int limitC, int roomNum, String password) {
		setTitle("[ " + roomNum + "번방 ] " + title);
		this.roomTitle = title;
		this.currentC = currentC;
		this.limitC = limitC;
		this.roomNum = roomNum;
		this.password = password;

	}

	private void init() {
		btnUserMenu = new JButton("대기실유저");
		btnChatRoomSetting = new JButton("채팅방 설정");
		btnClose = new JButton("나가기");
		taChat = new JTextArea(10, 18);
		pnlUserIn = new JPanel();
		taChat.setTabSize(4);
		taChat.setLineWrap(true);
		taChat.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		taChat.setEditable(false);
		taChat.setOpaque(true);
		taChat.setForeground(Color.BLACK);

	}

	// 방장 방 설정 변경 사용 가능
	public void useSetting() {
		btnChatRoomSetting.setVisible(true);
	}

	// 방 설정 변경 사용 불가
	public void notUseSetting() {
		btnChatRoomSetting.setVisible(false);
	}

	private void setDisplay() {
		JPanel mainPnl = new JPanel();
		mainPnl.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPnl.setLayout(new BorderLayout(0, 0));
		mainPnl.setOpaque(true);
		mainPnl.setBackground(Color.WHITE);

		JPanel pnlButton = new JPanel(new BorderLayout());
		pnlButton.setOpaque(true);
		pnlButton.setBackground(Color.WHITE);
		JPanel pnlContent = new JPanel(new BorderLayout());
		pnlContent.setOpaque(true);
		pnlContent.setBackground(Color.WHITE);
		JPanel pnlText = new JPanel();
		pnlText.setOpaque(true);
		pnlText.setBackground(Color.WHITE);
		pnlText.setPreferredSize(new Dimension(100, 35));

		JPanel pnlButtonWest = new JPanel();
		pnlButtonWest.setOpaque(true);
		pnlButtonWest.setBackground(Color.WHITE);
		btnUserMenu.setPreferredSize(new Dimension(110, 20));
		pnlButtonWest.add(btnUserMenu);
		JPanel pnlButtonEast = new JPanel();
		pnlButtonEast.setOpaque(true);
		pnlButtonEast.setBackground(Color.WHITE);
		btnChatRoomSetting.setPreferredSize(new Dimension(110, 20));
		btnChatRoomSetting.setVisible(false);
		btnClose.setPreferredSize(new Dimension(80, 20));
		pnlButtonEast.add(btnChatRoomSetting);
		pnlButtonEast.add(btnClose);

		pnlButton.add(pnlButtonWest, BorderLayout.WEST);
		pnlButton.add(pnlButtonEast, BorderLayout.EAST);

		JPanel pnlTa = new JPanel(new GridLayout());
		pnlTa.add(taChat);

		JPanel pnlUser = new JPanel();
		pnlUser.setOpaque(true);
		pnlUser.setBackground(Color.WHITE);

		pnlUserIn = new JPanel();
		pnlUserIn.setOpaque(true);
		pnlUserIn.setBackground(Color.WHITE);
		pnlUserIn.setPreferredSize(new Dimension(150, 270));
		pnlUserIn.setBorder(new TitledBorder("사용자 목록"));

		pnlUser.add(pnlUserIn);

		JScrollPane taScroll = new JScrollPane(pnlTa);

		taScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JScrollPane userScroll = new JScrollPane(pnlUser);
		userScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		pnlContent.add(taScroll, BorderLayout.CENTER);
		pnlContent.add(userScroll, BorderLayout.EAST);
		pnlText.setLayout(new BorderLayout(0, 0));

		mainPnl.add(pnlButton, BorderLayout.NORTH);
		mainPnl.add(pnlContent, BorderLayout.CENTER);
		mainPnl.add(pnlText, BorderLayout.SOUTH);
		btnSend = new JButton("전송");
		btnSend.setPreferredSize(new Dimension(100,20));
		pnlText.add(btnSend, BorderLayout.EAST);
		tfInput = new JTextField(30);
		pnlText.add(tfInput, BorderLayout.CENTER);

		setContentPane(mainPnl);
	}

	private void addListeners() {
		tfInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						if (tfInput.getText().equals("")) {
						} else {
							PushDataDTO dataDTO = null;
							if (tfInput.getText().toString().indexOf("/w") == 0) {
								dataDTO = new PushDataDTO(RequestProtocol.REQUEST_WHISPER, tfInput.getText());
							} else {
								dataDTO = new PushDataDTO(RequestProtocol.REQUEST_CHATTINGROOM_MSG_INPUT,
										tfInput.getText());
							}
							tfInput.setText("");
							oos.writeObject(dataDTO);
							taChat.setCaretPosition(taChat.getDocument().getLength());
							oos.flush();
							oos.reset();

						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnSend.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (tfInput.getText().equals("")) {
					} else {
						PushDataDTO dataDTO = null;
						if (tfInput.getText().toString().indexOf("/w") == 0) {
							dataDTO = new PushDataDTO(RequestProtocol.REQUEST_WHISPER, tfInput.getText());
						} else {
							dataDTO = new PushDataDTO(RequestProtocol.REQUEST_CHATTINGROOM_MSG_INPUT,
									tfInput.getText());
						}
						tfInput.setText("");
						oos.writeObject(dataDTO);
						taChat.setCaretPosition(taChat.getDocument().getLength());
						oos.flush();
						oos.reset();

					}
				} catch (IOException ew) {
					ew.printStackTrace();
				}

			}
		});
		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				exit();

			}
		});

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				exit();
			}
		});
		btnUserMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Integer user = RequestProtocol.REQUEST_ALL_USER_DATA;
				try {
					oos.writeObject(user);
					oos.flush();
					oos.reset();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnChatRoomSetting.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				CreatRoomDialog dlg = new CreatRoomDialog(ChattingRoomFrame.this, oos, getRoomTitle(), getPassword(),
						getLimitC(), getRoomNum());
				dlg.setRoomCurrentCount(getCurrentC());
			}
		});

	}

	public void exit() {
		if (host.getNickName().equals(myName)) {
			Integer exit = RequestProtocol.REQUEST_CHATTINGROOM_HOST_EXIT;

			int n = JOptionPane.showConfirmDialog(this, "방장을 위임하시겠습니까?\n아니오를 누를 시 모든 유저가 대기실로 이동합니다.");
			if (n == JOptionPane.YES_OPTION) {

			} else if (n == JOptionPane.NO_OPTION) {

				try {
					oos.writeObject(exit);
					oos.flush();
					oos.reset();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} else {
			Integer exit = RequestProtocol.REQUEST_CHATTINGROOM_EXIT;
			try {
				oos.writeObject(exit);
				oos.flush();
				oos.reset();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void showFrame() {
		setTitle("[ " + roomNum + "번방 ] " + roomTitle);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		tfInput.requestFocus();
	}

	public void inputMsg(String msg) {
		taChat.append(msg + "\n");
	}

	public void setOos(ObjectOutputStream oos) {
		this.oos = oos;
	}

	// 방장 설정
	public void addPanel(String nickName, String gender) {
		UserInfoPanel temp = new UserInfoPanel(nickName, gender, oos);
		temp.changeColor();
		temp.deleteJMenu();
		pnlUserIn.add(temp);
		myName = nickName;
		temp.setMaster();
	}

	public void notUserMenu() {
		btnUserMenu.setVisible(false);
	}

	public void showUser(RoomUserListDTO rul, String name) {
		pnlUserIn.removeAll();
		pnlUserIn.repaint();

		Client[] c = rul.getUserList();

		for (int i = 0; i < c.length; i++) {
			UserInfoPanel uip = new UserInfoPanel(c[i].getNickName(), c[i].getGender(), oos);
			uip.setChattingRoomFrame(this);

			btnChatRoomSetting.setVisible(false);
			btnUserMenu.setVisible(false);

			// 자기 자신일 경우
			if (c[i].getNickName().equals(name)) {
				uip.deleteJMenu();
				uip.changeColor();
			}
			
			if (host.getNickName().equals(c[i].getNickName())) {
				uip.setMaster();
			}

			// 방장일 때의 모든 클라이언트들의 권한 설정
			if (host.getNickName().equals(name)) {
				uip.getMiPass().setVisible(true);
				uip.getMiKick().setVisible(true);
				btnChatRoomSetting.setVisible(true);
				btnUserMenu.setVisible(true);
			}

			pnlUserIn.add(uip);
		}

		pnlUserIn.revalidate();
	}

	public void showUser(Client[] userList, String name) {
		pnlUserIn.removeAll();
		pnlUserIn.repaint();
		for (int i = 0; i < userList.length; i++) {
			UserInfoPanel uip = new UserInfoPanel(userList[i].getNickName(), userList[i].getGender(), oos);
			uip.setChattingRoomFrame(this);

			btnChatRoomSetting.setVisible(false);
			btnUserMenu.setVisible(false);

			// 자기 자신일 경우
			if (userList[i].getNickName().equals(name)) {
				uip.deleteJMenu();
				uip.changeColor();
				// 자기 자신인데 방장인 경우 왕관 달아줌
			}
			
			if (host.getNickName().equals(userList[i].getNickName())) {
				uip.setMaster();
			}

			// 클라이언트가 방장일 경우 모든 클라이언트의 권한 설정
			if (host.getNickName().equals(name)) {
				uip.getMiPass().setVisible(true);
				uip.getMiKick().setVisible(true);
				btnChatRoomSetting.setVisible(true);
				btnUserMenu.setVisible(true);
			}

			pnlUserIn.add(uip);
		}
		pnlUserIn.revalidate();
	}
}


class ChattingRoomInfo {
	private Client roomHost;
	private int roomNumber;
	private String roomTitle;
	private String roomPassword;
	private int roomCurrentCount;
	private int roomLimitCount;
	
	
	public ChattingRoomInfo(Client roomHost, int roomNumber, String roomTitle, String roomPassword,
			int roomCurrentCount, int roomLimitCount) {
		super();
		this.roomHost = roomHost;
		this.roomNumber = roomNumber;
		this.roomTitle = roomTitle;
		this.roomPassword = roomPassword;
		this.roomCurrentCount = roomCurrentCount;
		this.roomLimitCount = roomLimitCount;
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


class ChattingRoomPanel extends JPanel {
	private JLabel lblPeople;
	private JLabel lblLock;
	private JLabel lblRoomTitle;
	private int roomNumber;
	private String roomTitle;
	private int currentCount;
	private int limitCount;
	private String password;
	private ObjectOutputStream oos;
	
	public ChattingRoomPanel(int roomNumber, String roomTitle, int currentCount, int limitCount, String password, ObjectOutputStream oos) {
		this.roomNumber = roomNumber;
		this.roomTitle = roomTitle;
		this.currentCount = currentCount;
		this.limitCount = limitCount;
		this.password = password;
		this.oos = oos;
		init();
		addListeners();
		setDisplay();
	}

	public void init() {
		lblPeople = new JLabel("참가인원" + currentCount + "/" + limitCount);
		setLock(password);
	}

	public void addListeners() {
		ChattingRoomPanel.this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent me) {
				showChattingRoomJoin(me);
			}
		});
	}
	public void setLock(String lock){
		if(password.equals("")){
			lblLock = new JLabel("공개");
		} else{
			lblLock = new JLabel("비공개");
		}
	}	
	
	public void showChattingRoomJoin(MouseEvent me) {
		ChattingRoomInfoDTO chattingRoomInfoDTO;
		if(limitCount > currentCount) {
			 chattingRoomInfoDTO = new ChattingRoomInfoDTO(RequestProtocol.REQUEST_ENTER_CHATTINGROOM,
					 roomNumber, roomTitle,password,limitCount);
			if(password.equals("")){				 
				  try {
					oos.writeObject(chattingRoomInfoDTO);
					oos.flush();
					oos.reset();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				new PassWordInputDialog(this.password, chattingRoomInfoDTO, oos);
			}
		} else{
			JOptionPane.showMessageDialog(ChattingRoomPanel.this, "인원이 가득!!");
		}
	}

	public void setDisplay() {
		setPreferredSize(new Dimension(500, 30));
//		setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setBorder(new LineBorder(Color.BLACK, 1));
		setBackground(new Color(255, 255, 255));
		setLayout(new BorderLayout());

		JPanel pnlWest = new JPanel();
		pnlWest.setBackground(new Color(255, 255, 255));
		JPanel pnlEast = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlEast.getLayout();
		flowLayout.setVgap(6);
		pnlEast.setBackground(new Color(255, 255, 255));

		pnlWest.add(lblLock);

		pnlEast.add(lblPeople);

		add(pnlWest, BorderLayout.WEST);
		lblRoomTitle = new JLabel("[" + roomNumber + "]\t" + "방제목 : " + roomTitle);
		FlowLayout fl_pnlCenter = new FlowLayout(FlowLayout.LEFT);
		fl_pnlCenter.setVgap(6);
		JPanel pnlCenter = new JPanel(fl_pnlCenter);
		pnlCenter.setBackground(new Color(255, 255, 255));
		
				// pnlCenter.add(l);
				pnlCenter.add(lblRoomTitle);
				add(pnlCenter, BorderLayout.CENTER);
		add(pnlEast, BorderLayout.EAST);

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
		return nickName == subNickName;
	}
}




class ClientThread extends Thread {
	private Socket socket;

	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private FirstFrame firstFrame;
	private MainFrame mainFrame;
	private ChattingRoomFrame chattingRoomFrame;
	private CreatRoomDialog creatRoomDialog;

	public ClientThread(FirstFrame firstFrame, Socket socket, ObjectOutputStream oos, ObjectInputStream ois) {
		this.socket = socket;
		this.firstFrame = firstFrame;
		this.oos = oos;
		this.ois = ois;

	}

	@Override
	public void run() {
		Object obj = null;
		String name = getName();
		try {// 대기실 메시지 보내기
			while ((obj = ois.readObject()) != null) {
				if (obj instanceof PushDataDTO) {
					PushDataDTO temp = (PushDataDTO) obj;
					int n = temp.getCode();

					if (n == ResponseProtocol.RESPONSE_CHATTINGROOM_MSG_INPUT_OK
							|| n == ResponseProtocol.RESPONSE_CHATTINGROOM_NOTIFY

					) {
						// 채팅방 사용자들에게 메세지를 뿌려주는 것
						String msg = (String) temp.getData();
						chattingRoomFrame.inputMsg(msg);
					} else if (n == ResponseProtocol.RESPONSE_RANDOM_ENTER_CHATTINGROOM_NO) {
						// 랜덤입장에 실패했을 경우 메세지
						String msg = (String) temp.getData();
						JOptionPane.showMessageDialog(mainFrame, msg);
					} else if (n == ResponseProtocol.RESPONSE_WATINGROOM_MSG_INPUT_OK) {
						// 대기실 채팅 전송
						String msg = (String) temp.getData();
						mainFrame.inputMsg(msg);

					} else if (n == ResponseProtocol.RESPONSE_WHISPER_OK) {
						// 귓속말 전송
						JFrame frame = mainFrame;
						if (frame != null) {
							String msg = (String) temp.getData();
							mainFrame.inputMsg(msg);
						} else {
							String msg = (String) temp.getData();
							chattingRoomFrame.inputMsg(msg);
						}
					} else if (n == ResponseProtocol.RESPONSE_WHISPER_NO) {
						// 귓속말 전송 실패
						String msg = (String) temp.getData();
						JOptionPane.showMessageDialog(mainFrame, msg);
					} else if (n == ResponseProtocol.RESPONSE_ALL_USER_DATA_NO) {
						String msg = (String) temp.getData();
						JOptionPane.showMessageDialog(chattingRoomFrame, msg);
					} else if (n == ResponseProtocol.RESPONSE_CHANGE_SETTING_ROOM_NO) {
						String msg = (String) temp.getData();
						JOptionPane.showMessageDialog(creatRoomDialog, msg);
					} else if (n == ResponseProtocol.RESPONSE_CHATTINGROOM_EXPLOSION) {
						Client host = chattingRoomFrame.getHost();
						chattingRoomFrame.dispose();
						String msg = (String) temp.getData();
						if (!host.getNickName().equals(getName())) {
							JOptionPane.showMessageDialog(mainFrame, msg);
						}
						mainFrame = new MainFrame(oos);
					} else if (n == ResponseProtocol.RESPONSE_USER_INVITE_DELIVERY) {
						String msg = (String) temp.getData();
						int i = JOptionPane.showConfirmDialog(mainFrame, msg + "님이 초대장을 보내셨습니다.");
						if (i == JOptionPane.YES_OPTION) {
							PushDataDTO yesDTO = (PushDataDTO) obj;
							yesDTO.setCode(RequestProtocol.REQUEST_USER_INVITE_ACCEPT);
							yesDTO.setData(msg);
							oos.writeObject(yesDTO);
							oos.flush();
							oos.reset();
						} else {
							DataDTO dataDTO = new DataDTO(RequestProtocol.REQUEST_USER_INVITE_NOT_ACCEPT, getName(),
									msg);

							oos.writeObject(dataDTO);
							oos.flush();
							oos.reset();
						}
					} else if (n == ResponseProtocol.RESPONSE_USER_INVITE_DELIVERY_NO) {
						String requestUser = (String) temp.getData();
						chattingRoomFrame.inputMsg(requestUser);
					} else if (n == ResponseProtocol.RESPONSE_MASTER_ENTERUST_NO) {
						String msg = (String) temp.getData();
						chattingRoomFrame.inputMsg(msg);
					} else if (n == ResponseProtocol.RESPONSE_USER_INVITE_DELIVERY_FALSE) {
						String msg = (String) temp.getData();
						JOptionPane.showMessageDialog(chattingRoomFrame, msg);
					} else if (n == ResponseProtocol.RESPONSE_USER_FORCED_EXIT_NO) {
						String msg = (String) temp.getData();
						chattingRoomFrame.inputMsg(msg);
					}
					// 대기실 입장
				} else if (obj instanceof WaitingRoomUpdateDTO) {
					WaitingRoomUpdateDTO wru = (WaitingRoomUpdateDTO) obj;
					int n = wru.getCode();
					// 클라이언트가 처음 로그인 했을 때 1100
					if (n == ResponseProtocol.RESPONSE_NICK_CHECK_OK) {

						mainFrame = new MainFrame(oos);
						mainFrame.showUser(wru, name);
						mainFrame.showRoomList(wru);
						firstFrame.dispose();
						firstFrame = null;

					} else if (n == ResponseProtocol.RESPONSE_ENTER_CHATTINGROOM_UPDATE
							|| n == ResponseProtocol.RESPONSE_NICK_CHECK_NOTIFY
							|| n == ResponseProtocol.RESPONSE_CREATE_CHATTINGROOM_OK
							|| n == ResponseProtocol.RESPONSE_ENTER_CHATTINGROOM_UPDATE
							|| n == ResponseProtocol.RESPONSE_RANDOM_ENTER_CHATTINGROOM_UPDATE_UI
							|| n == ResponseProtocol.RESPONSE_DUE_TO_EXPLOSION_WAITINGROOM_UPDATE
							|| n == ResponseProtocol.RESPONSE_DUE_TO_SETTING_ROOM_WAITINGROOM_UPDATE
							|| n == ResponseProtocol.RESPONSE_DUE_TO_EXPLOSION_WAITINGROOM_UPDATE
							|| n == ResponseProtocol.RESPONSE_USER_OUT_UPDATE
							|| n == ResponseProtocol.RESPONSE_DUE_TO_USER_INVITE_WAITINGROOM_UPDATE) {
						// 사용자가 채팅방 입장 했을 때 대기실 유저들의 UI 업데이트
						mainFrame.showUser(wru, name);
						mainFrame.showRoomList(wru);

					} else if (n == ResponseProtocol.RESPONSE_CHATTINGROOM_EXIT_OK
							|| n == ResponseProtocol.RESPONSE_USER_FORCED_EXIT_OK) {
						// 요청한 클라이언트가 채팅방에서 나왔을 경우 실행하는 거임
						chattingRoomFrame.dispose();
						mainFrame = new MainFrame(oos);
						mainFrame.showUser(wru, name);
						mainFrame.showRoomList(wru);
						
						if (n == ResponseProtocol.RESPONSE_USER_FORCED_EXIT_OK) {
							new KickImgDlg(mainFrame);
						}

					} else if (n == ResponseProtocol.RESPONSE_USER_OUT_OK) {
						socket.close();
						mainFrame.exit();
					}

					// 채팅방 생성 했을 때의 채팅방 정보를 받는 것
				} else if (obj instanceof ChattingRoomSubInfo) {
					ChattingRoomSubInfo crs = (ChattingRoomSubInfo) obj;
					Client host = crs.getHost();
					int currentC = crs.getRoomCurrentCount();
					int limitC = crs.getRoomLimitCount();
					int roomNum = crs.getRoomNumber();
					String roomTitle = crs.getRoomTitle();
					String roomPassword = crs.getRoomPassword();
					chattingRoomFrame = new ChattingRoomFrame(currentC, limitC, roomNum, roomTitle, oos);
					chattingRoomFrame.setPassword(roomPassword);
					chattingRoomFrame.addPanel(host.getNickName(), host.getGender());
					chattingRoomFrame.useSetting();
					chattingRoomFrame.setHost(host);
					chattingRoomFrame.setMyName(host.getNickName());

					mainFrame.dispose();
					mainFrame = null;

				} else if (obj instanceof AllUserDataDTO) {
					AllUserDataDTO ado = (AllUserDataDTO) obj;
					int code = ado.getCode();
					if (code == ResponseProtocol.RESPONSE_ALL_USER_DATA_OK) {
						TotalPeopleDlg tpd = new TotalPeopleDlg(chattingRoomFrame, oos);
						Client[] list = ado.getWaitingRoomUserList();
						if (list != null) {
							tpd.setUserlist(list);
						}
					}
				} else if (obj instanceof RoomUserListDTO) {
					RoomUserListDTO rul = (RoomUserListDTO) obj;
					int code = rul.getCode();
					// (요청 클라이언트) 채팅룸 입장했을 때 유저목록 갱신
					if (code == ResponseProtocol.RESPONSE_ENTER_CHATTINGROOM_UI_UPDATE) {
						// 채팅방에 유저가 들어왔을 때 사용자 목록을 업데이트
						chattingRoomFrame.showUser(rul, name);
					}

				} else if (obj instanceof DataDTO) {
					DataDTO ddto = (DataDTO) obj;
					int code = ddto.getCode();

					if (code == ResponseProtocol.RESPONSE_ENTER_CHATTINGROOM_OK
							|| code == ResponseProtocol.RESPONSE_RANDOM_ENTER_CHATTINGROOM_OK
							|| code == ResponseProtocol.RESPONSE_USER_INVITE_DELIVERY_OK) {
						// ChattingRoomSubInfo, userListTemp
						ChattingRoomSubInfo info = (ChattingRoomSubInfo) ddto.getData()[0];
						Client[] list = (Client[]) ddto.getData()[1];

						String title = "[" + info.getRoomNumber() + "번방] " + info.getRoomTitle();
						chattingRoomFrame = new ChattingRoomFrame();
						System.out.println("호스트 " + info.getHost().getNickName());
						chattingRoomFrame.setHost(info.getHost());
						chattingRoomFrame.setRoomTitle(info.getRoomTitle());
						chattingRoomFrame.setTitle(title);
						chattingRoomFrame.setPassword(info.getRoomPassword());
						chattingRoomFrame.setCurrentC(info.getRoomCurrentCount());
						chattingRoomFrame.setLimitC(info.getRoomLimitCount());
						chattingRoomFrame.showUser(list, name);
						chattingRoomFrame.notUserMenu();
						chattingRoomFrame.setOos(oos);
						chattingRoomFrame.setMyName(getName());

						// 메인 프레임 닫기
						mainFrame.dispose();
						mainFrame = null;

					} else if (code == ResponseProtocol.RESPONSE_MASTER_ENTRUST_DELIVERY) {
						String hostName = (String) ddto.getData()[0];
						String message = (String) ddto.getData()[1];

						int select = JOptionPane.showConfirmDialog(chattingRoomFrame, message);
						if (select == JOptionPane.YES_OPTION) {

							oos.writeObject(new PushDataDTO(RequestProtocol.REQUEST_MASTER_ENTRUST_RECEIVE, hostName));
							oos.flush();
							oos.reset();
						} else if (select == JOptionPane.NO_OPTION) {
							oos.writeObject(
									new PushDataDTO(RequestProtocol.REQUEST_MASTER_ENTRUST_NOT_RECEIVE, hostName));
							oos.flush();
							oos.reset();
						}
					} else if (code == ResponseProtocol.RESPONSE_MASTER_ENTRUST_OK_NOTIFY) {
						// data[0] = 클라이언트배열 , data[1] host data[2] = String 메세지
						Client[] uesrList = (Client[]) ddto.getData()[0];
						Client host = (Client) ddto.getData()[1];
						String message = (String) ddto.getData()[2];
						chattingRoomFrame.setHost(host);
						chattingRoomFrame.showUser(uesrList, name);
						chattingRoomFrame.inputMsg(message);
					}

					if (code == ResponseProtocol.RESPONSE_CHATTINGROOM_NOTIFY
							|| code == ResponseProtocol.RESPONSE_RANDOM_ENTER_CHATTINGROOM_NOTIFY
							|| code == ResponseProtocol.RESPONSE_ENTER_CHATTINGROOM_NOTIFY
							|| code == ResponseProtocol.RESPONSE_USER_INVITE_NOTIFY) {
						Client[] userList = (Client[]) ddto.getData()[0];
						String msg = (String) ddto.getData()[1];
						chattingRoomFrame.inputMsg(msg);
						chattingRoomFrame.showUser(userList, name);

					} else if (code == ResponseProtocol.RESPONSE_CHANGE_SETTING_ROOM_NOTIFY) {
						ChattingRoomSubInfo crs = (ChattingRoomSubInfo) ddto.getData()[0];
						String msg = (String) ddto.getData()[1];
						String title = crs.getRoomTitle();
						int currentC = crs.getRoomCurrentCount();
						int limitC = crs.getRoomLimitCount();
						int roomNum = crs.getRoomNumber();
						String password = crs.getRoomPassword();
						chattingRoomFrame.setChattingRoom(title, currentC, limitC, roomNum, password);
						chattingRoomFrame.inputMsg(msg);
					} else if (code == ResponseProtocol.RESPONSE_USER_FORCED_EXIT_NOTIFY) {
						Client[] list = (Client[]) ddto.getData()[0];
						String msg = (String) ddto.getData()[1];
						chattingRoomFrame.showUser(list, name);
						chattingRoomFrame.inputMsg(msg);
					}
				} else if (obj instanceof NickNameOverlapException) {
					NickNameOverlapException nickNameOverlapException = (NickNameOverlapException) obj;
					JOptionPane.showMessageDialog(firstFrame, nickNameOverlapException.getMessage());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}





class CreatRoomDialog extends JDialog {
	private JLabel roomTitle;
	private JLabel password;
	private MainFrame mainf;
	private ChattingRoomFrame crf;
	private int roomCurrentCount;
	private JLabel peopleLimit;
	private JComboBox<String> cbxPeopleLimit;

	private JTextField tfRoomTitle;
	private JTextField tfpassword;

	private JButton btnConfirm;
	private JButton btnCancel;
	private int roomNum;

	private JButton btnChange;
	private String[] maxPeople = { "1", "2", "3", "4", "5" };
	private ObjectOutputStream oos;

	// ============================
	private JPanel pnlAll = new JPanel(new BorderLayout());
	private JPanel pnlCenter = new JPanel(new GridLayout(0, 1));
	private JPanel pnlCenter1;
	private JPanel pnlCenter2;
	private JPanel pnlCenter3;
	private JPanel pnlSouth = new JPanel();

	public CreatRoomDialog(MainFrame mainf, ObjectOutputStream oos) {
		super(mainf, "방생성", true);
		this.mainf = mainf;
		this.oos = oos;
		init();
		pnlSouth.add(btnConfirm);
		setDisplay();
		addListeners();
		setTitle("채팅방생성");
		showFrame();

	}

	public CreatRoomDialog(ChattingRoomFrame crf, ObjectOutputStream oos, String tfRoomTitle, String tfpassword,
			int cbxPeopleLimit, int roomNum) {
		init();
		pnlSouth.add(btnChange);
		setDisplay();
		addListeners();
		setTitle("채팅방변경");
		showFrame();
		this.roomNum = roomNum;
		this.crf = crf;
		this.oos = oos;
		
		this.tfRoomTitle.setText(tfRoomTitle);
		this.tfpassword.setText(tfpassword);
		
		String sss = this.cbxPeopleLimit.getItemAt(cbxPeopleLimit - 1);
		this.cbxPeopleLimit.setSelectedItem(sss);

	}

	public int getRoomCurrentCount() {
		return roomCurrentCount;
	}

	public void setRoomCurrentCount(int roomCurrentCount) {
		this.roomCurrentCount = roomCurrentCount;
	}

	private void init() {

		roomTitle = new JLabel("방 제목");
		roomTitle.setPreferredSize(new Dimension(60, 20));
		tfRoomTitle = new JTextField(15);
		password = new JLabel("비밀번호");
		password.setPreferredSize(new Dimension(60, 20));
		tfpassword = new JTextField(15);

		peopleLimit = new JLabel("인원제한");
		peopleLimit.setPreferredSize(new Dimension(60, 20));
		cbxPeopleLimit = new JComboBox<String>(maxPeople);
		btnConfirm = new JButton("확인");
		btnChange = new JButton("변경");
		btnCancel = new JButton("취소");

	}

	private void setDisplay() {

		pnlCenter1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlCenter2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pnlCenter3 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		pnlCenter1.add(roomTitle);
		pnlCenter1.add(tfRoomTitle);
		pnlCenter2.add(password);
		pnlCenter2.add(tfpassword);

		pnlCenter3.add(peopleLimit);
		pnlCenter3.add(cbxPeopleLimit);

		// pnlSouth.add(btnConfirm);
		// pnlSouth.add(btnChange);
		pnlSouth.add(btnCancel);

		pnlCenter.add(pnlCenter1);
		pnlCenter.add(pnlCenter2);
		pnlCenter.add(pnlCenter3);
		pnlAll.add(pnlCenter, BorderLayout.CENTER);
		pnlAll.add(pnlSouth, BorderLayout.SOUTH);
		add(pnlAll, BorderLayout.CENTER);
	}

	private void addListeners() {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
//				String str = (String) cbxPeopleLimit.getSelectedItem();
				ChattingRoomInfoDTO crid = new ChattingRoomInfoDTO(RequestProtocol.REQUEST_CREATE_CHATTINGROOM, roomNum,
						tfRoomTitle.getText(), tfpassword.getText(),
						Integer.parseInt(cbxPeopleLimit.getSelectedItem().toString()));
				crid.setRoomCurrentCount(roomCurrentCount);
				if (obj == btnConfirm) {
					try {
						oos.writeObject(crid);
						oos.flush();
						oos.reset();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else if (obj == btnChange) {
					crid.setCode(RequestProtocol.REQUEST_CHANGE_SETTING_ROOM);
					try {
						oos.writeObject(crid);
						oos.flush();
						oos.reset();
					} catch (IOException e1) {
						e1.printStackTrace();
					}

				}
				dispose();
			}

		};
		btnConfirm.addActionListener(listener);
		btnChange.addActionListener(listener);
		
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

	private void showFrame() {
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
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


class HostChangeDTO {
	
	public static void main(String[] args) {
		new HostChangeDTO();
	}
}



class KickImgDlg extends JDialog {

	private final JPanel contentPanel = new JPanel();

	public KickImgDlg(MainFrame mf) {
		super(mf, true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JLabel lblNewLabel = new JLabel(new ImageIcon("img.jpg"));
			contentPanel.add(lblNewLabel);
		}
		setTitle("강퇴당함 ㅋㅋㅋ 메롱");
		pack();
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

}



class MainFrame extends JFrame {

	private Socket sock;

	private JTextArea taChat;
	private JTextField tfChat;
	private JButton btnCreate;
	private JButton btnRandom;
	private JButton btnEnter;
	private ObjectOutputStream oos;

	public ObjectOutputStream getOos() {
		return oos;
	}

	private JPanel pnlChat;
	private JPanel pnlUser;
	private JPanel pnlMe;
	private JPanel pnlChatRoom;

	public MainFrame() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}
		init();
		setDisplay();
		addListeners();
		showFrame();
	}

	public MainFrame(ObjectOutputStream oos) {
		this();
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}
		this.oos = oos;
	}

	public void setSock(Socket sock) {
		this.sock = sock;
	}

	public Socket getSock() {
		return sock;
	}

	public void init() {
		taChat = new JTextArea(8, 40);
		taChat.setFont(new Font("맑은 고딕", Font.BOLD, 16));
		taChat.setEditable(false);
		taChat.setOpaque(true);
		taChat.setForeground(Color.BLACK);
		tfChat = new JTextField(40);
		btnCreate = new JButton("방생성");
		btnRandom = new JButton("랜덤입장");
		btnEnter = new JButton("전송");
		pnlUser = new JPanel();
		System.out.println(pnlUser);
		pnlMe = new JPanel();
		pnlUser.setPreferredSize(new Dimension(120, 0));
		pnlUser.setOpaque(true);
		pnlUser.setBackground(Color.WHITE);
		pnlChatRoom = new JPanel();
		pnlChatRoom.setOpaque(true);
		pnlChatRoom.setBackground(Color.WHITE);
		pnlChatRoom.setPreferredSize(new Dimension(260, 0));
		pnlMe.setPreferredSize(new Dimension(150, 0));
		taChat.setTabSize(4);
		taChat.setLineWrap(true);
		taChat.setWrapStyleWord(true);
		

	}

	public void showUser(WaitingRoomUpdateDTO wru, String name) {
		int width = pnlUser.getWidth();
		int height = 0;
		Client[] c = wru.getWaitingRoomUserList();
		pnlUser.removeAll();
		pnlUser.repaint();

		for (int i = 0; i < c.length; i++) {
			UserInfoPanel uip = new UserInfoPanel(c[i].getNickName(), c[i].getGender(), oos);
			uip.setMainFrame(this);
			if (c[i].getNickName().equals(name) == true) {
				pnlMe.removeAll();
				uip.deleteJMenu();
				uip.changeColor();
				pnlMe.add(uip);

			} else {
				pnlUser.add(uip);
				pnlUser.setPreferredSize(new Dimension(width, height += 35));
			}

		}
		pnlUser.revalidate();
	}

	public void showRoomList(WaitingRoomUpdateDTO wru) {
		int width = pnlChatRoom.getWidth();
		int height = 0;
		pnlChatRoom.removeAll();
		pnlChatRoom.repaint();
		ChattingRoomSubInfo[] getChattingRoomSubInfo = wru.getChattingRoomSubInfo();

		for (int i = 0; i < getChattingRoomSubInfo.length; i++) {
			int roomNumber = getChattingRoomSubInfo[i].getRoomNumber();
			String roomTitle = getChattingRoomSubInfo[i].getRoomTitle();
			int currentCount = getChattingRoomSubInfo[i].getRoomCurrentCount();
			int limitCount = getChattingRoomSubInfo[i].getRoomLimitCount();
			String password = getChattingRoomSubInfo[i].getRoomPassword();
			pnlChatRoom.add(new ChattingRoomPanel(roomNumber, roomTitle, currentCount, limitCount, password, oos));
			pnlChatRoom.setPreferredSize(new Dimension(width, height += 35));
			System.out.println("위드" + width + "\t헤잇 " + height);
		}
		pnlChatRoom.revalidate();
	}

	public void setDisplay() {
		JPanel mainPnl = new JPanel();
		mainPnl.setOpaque(true);
		mainPnl.setBackground(Color.WHITE);
		JPanel mainEastPnl = new JPanel(new BorderLayout());
		mainEastPnl.setOpaque(true);
		mainEastPnl.setBackground(Color.WHITE);
		mainPnl.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPnl.setLayout(new BorderLayout(0, 0));

		JPanel pnlChatInput = new JPanel(new BorderLayout());
		pnlChatInput.setOpaque(true);
		pnlChatInput.setBackground(Color.WHITE);
		pnlChatInput.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnlChatInput.add(tfChat, BorderLayout.CENTER);
		pnlChatInput.add(btnEnter, BorderLayout.EAST);

		JPanel pnlButton = new JPanel(new BorderLayout());
		pnlButton.setOpaque(true);
		pnlButton.setBackground(Color.WHITE);
		JPanel pnlButtonWest = new JPanel();
		pnlButtonWest.setOpaque(true);
		pnlButtonWest.setBackground(Color.WHITE);
		JPanel pnlButtonEast = new JPanel();
		pnlButtonEast.setOpaque(true);
		pnlButtonEast.setBackground(Color.WHITE);
		pnlButtonEast.add(btnCreate);
		pnlButtonEast.add(btnRandom);

		pnlButton.add(pnlButtonWest, BorderLayout.WEST);
		pnlButton.add(pnlButtonEast, BorderLayout.EAST);

		pnlChat = new JPanel(new BorderLayout());
		pnlChat.setOpaque(true);
		pnlChat.setBackground(Color.WHITE);

		JScrollPane taScroll = new JScrollPane(taChat);
		taScroll.setOpaque(true);
		taScroll.setBackground(Color.WHITE);

		taScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		taScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		taScroll.getVerticalScrollBar().setValue(taScroll.getVerticalScrollBar().getMaximum());

		pnlChat.add(pnlButton, BorderLayout.NORTH);
		pnlChat.add(taScroll, BorderLayout.CENTER);
		pnlChat.add(pnlChatInput, BorderLayout.SOUTH);

		JScrollPane userScroll = new JScrollPane(pnlUser);
		userScroll.setOpaque(true);
		userScroll.setBackground(Color.WHITE);
		pnlMe.setPreferredSize(new Dimension(150, 80));
		pnlMe.setOpaque(true);
		pnlMe.setBackground(Color.WHITE);
		userScroll.setPreferredSize(new Dimension(150, 200));

		pnlMe.setBorder(new TitledBorder("나"));
		userScroll.setBorder(new TitledBorder("대기자 목록"));
		userScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		userScroll.setOpaque(true);
		userScroll.setBackground(Color.WHITE);

		mainEastPnl.add(pnlMe, BorderLayout.NORTH);
		mainEastPnl.add(userScroll, BorderLayout.CENTER);
		mainPnl.add(pnlChat, BorderLayout.SOUTH);
		mainPnl.add(mainEastPnl, BorderLayout.EAST);

		setContentPane(mainPnl);

		JPanel panel = new JPanel();

		mainPnl.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout());

		JScrollPane chatScroll = new JScrollPane(pnlChatRoom);
		chatScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		chatScroll.setPreferredSize(new Dimension(300, 0));
		panel.add(chatScroll);
		chatScroll.setOpaque(true);
		chatScroll.setBackground(Color.WHITE);

		chatScroll.setBorder(new TitledBorder("채팅방 목록"));
	}

	public void addListeners() {
		tfChat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
					try {
						if (tfChat.getText().equals("")) {
						} else {
							PushDataDTO dataDTO;
							if (tfChat.getText().toString().indexOf("/w") == 0) {
								dataDTO = new PushDataDTO(RequestProtocol.REQUEST_WHISPER, tfChat.getText());
							} else {
								dataDTO = new PushDataDTO(RequestProtocol.REQUEST_WATINGROOM_MSG_INPUT,
										tfChat.getText());
							}
							tfChat.setText("");
							oos.writeObject(dataDTO);
							taChat.setCaretPosition(taChat.getDocument().getLength());
							oos.flush();
							oos.reset();
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		btnCreate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj == btnCreate) {
					new Dialog(new CreatRoomDialog(MainFrame.this, oos));
				}
			}
		});
		btnRandom.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if (obj == btnRandom) {
					randomRoomJoin();
				}
			}
		});
		btnEnter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (tfChat.getText().equals("")) {
					} else {
						PushDataDTO dataDTO;
						if (tfChat.getText().toString().indexOf("/w") == 0) {
							dataDTO = new PushDataDTO(RequestProtocol.REQUEST_WHISPER, tfChat.getText());
						} else {
							dataDTO = new PushDataDTO(RequestProtocol.REQUEST_WATINGROOM_MSG_INPUT, tfChat.getText());
						}
						tfChat.setText("");
						oos.writeObject(dataDTO);
						taChat.setCaretPosition(taChat.getDocument().getLength());
						oos.flush();
						oos.reset();
					}
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}

		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				Integer out = RequestProtocol.REQUEST_USER_OUT;
				try {
					oos.writeObject(out);
					oos.flush();
					oos.reset();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		});
	}

	public void randomRoomJoin() {
		Integer random = RequestProtocol.REQUEST_RANDOM_ENTER_CHATTINGROOM;
		try {
			oos.writeObject(random);
			oos.flush();
			oos.reset();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void exit() {
		System.exit(0);
	}

	public void showFrame() {
		setTitle("채팅창");
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		tfChat.requestFocus();
	}

	public void inputMsg(String msg) {
		taChat.append(msg + "\n");
	}

	public void addTfInput(String msg) {
		this.tfChat.setText(msg);
	}
}

class NickNameOverlapException extends RuntimeException implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4073731244463616172L;
	int code = ResponseProtocol.RESPONSE_NICK_CHECKC_NO;

	public NickNameOverlapException(String nickName) {
		super(nickName + "는 이미 사용중인 닉네임 입니다.");
	}

	public int getCode() {
		return code;
	}
	@Override
	public String toString(){
		return super.getMessage();
	}

}


class NotDeliveredException extends RuntimeException implements Serializable {
	int code = ResponseProtocol.RESPONSE_CHATTINGROOM_MSG_INPUT_NO;

	public NotDeliveredException() {
		super("서버에 문제가 있어 전송하지 못했습니다.");
	}
}



class PassWordInputDialog extends JDialog {
	private JLabel lblTitle;
	private JLabel lblPw;
	private JPasswordField pfPw;
	private JButton btnOk;
	private JButton btnCancel;
	private String password;
	ChattingRoomInfoDTO chattingRoomInfoDTO;
	private ObjectOutputStream oos;

	public PassWordInputDialog(String password, ChattingRoomInfoDTO chattingRoomInfoDTO, ObjectOutputStream oos) {
		this.password = password;
		this.chattingRoomInfoDTO = chattingRoomInfoDTO;
		this.oos = oos;
		init();
		addListener();
		setDisplay();
		showFrame();

	}

	private void init() {
		lblTitle = new JLabel("해당 채팅방은 잠금 상태입니다.");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 12));
		lblPw = new JLabel("비밀번호");
		pfPw = new JPasswordField(15);
		btnOk = new JButton("확인");
		btnCancel = new JButton("취소");
	}

	private void addListener() {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					dispose();
			}
		};
		btnCancel.addActionListener(listener);
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((String.valueOf(pfPw.getPassword()).equals(password))) {
					try {
						System.out.println("롸!~~~~~~~~~~~~");
						oos.writeObject(chattingRoomInfoDTO);
						oos.flush();
						oos.reset();
						dispose();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(PassWordInputDialog.this, "비밀번호가 틀렸습니다.");
				}
			}
		});
	}

	private void setDisplay() {
		JPanel pnlNorth = new JPanel();
		JPanel pnlCenter = new JPanel(new BorderLayout(0, 0));
		pnlCenter.setBorder(new EmptyBorder(5, 5, 5, 5));
		JPanel pnlSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));

		pnlNorth.add(lblTitle);

		pnlCenter.add(lblPw, BorderLayout.WEST);
		pnlCenter.add(pfPw, BorderLayout.EAST);

		pnlSouth.add(btnOk);
		pnlSouth.add(btnCancel);

		add(pnlNorth, BorderLayout.NORTH);
		add(pnlCenter, BorderLayout.CENTER);
		add(pnlSouth, BorderLayout.SOUTH);

	}

	private void showFrame() {
		setTitle("비밀번호를 입력해주세요.");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);

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
	int code = ResponseProtocol.RESPONSE_RANDOM_ENTER_CHATTINGROOM_NO;
	public RandomJoinFauilureException() {
//		JOptionPane.showMessageDialog(this, "어떤 방에도 입장 할 수 없음");
		
	}

}

abstract class RequestCode implements Serializable {
	private static final long serialVersionUID = 196359676881917616L;
	private int code;
	

	public RequestCode(int code) {
		super();
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
//	서버접속
	// 닉네임을 서버에 전송하여 대기실입장을 요청
	public static final int REQUEST_NICK_CHECK = 100;	
//  채팅 대기실
	// 채팅방 입장을 요청
	public static final int REQUEST_ENTER_CHATTINGROOM = 120;
	// 채팅방 랜덤입장
	public static final int REQUEST_RANDOM_ENTER_CHATTINGROOM = 130;
	// 채팅방 생성을 요청
	public static final int REQUEST_CREATE_CHATTINGROOM = 140; 
	// 대기실에 메시지 전송 요청
	public static final int REQUEST_WATINGROOM_MSG_INPUT = 160;
//  채팅방
	// 방장이 다른 클라이언트에게 방장 권한 위임 요청
	public static final int REQUEST_MASTER_ENTRUST = 200;
	// 방장권한을 받겠다는 응답
	public static final int REQUEST_MASTER_ENTRUST_RECEIVE = 201;
	// 방장권한을 받지 않겠다는 응답
	public static final int REQUEST_MASTER_ENTRUST_NOT_RECEIVE = 202;

	// 방설정 변경 요청
	public static final int REQUEST_CHANGE_SETTING_ROOM = 220; 

	// 현재 채팅방 나가기 요청
	public static final int REQUEST_CHATTINGROOM_EXIT = 230;	
	// 방장이 현재 채팅방 나가기 요청
	public static final int REQUEST_CHATTINGROOM_HOST_EXIT = 231;
	// 입력한 내용을 모든 클라이언트에게 전송해달라고 요청
	public static final int REQUEST_CHATTINGROOM_MSG_INPUT = 240;

	// 대기실에 있는 유저 정보를 요청
	public static final int REQUEST_ALL_USER_DATA = 250;

	// 유저 검색을 요청
	public static final int REQUEST_SEARCH_USER = 260; 

	// 대기실 유저 초대 요청
	public static final int REQUEST_USER_INVITE = 270; 
	// 초대를 받는다
	public static final int REQUEST_USER_INVITE_ACCEPT = 271;	
	// 초대를 받지않는다
	public static final int REQUEST_USER_INVITE_NOT_ACCEPT = 272;
	
	// 강제 퇴장
	public static final int REQUEST_USER_FORCED_EXIT = 280;
	
	// 다른 클라이언트에게 귓속말 요청
	public static final int REQUEST_WHISPER = 300; 
	
	public static final int REQUEST_USER_OUT = 444;

}



class ResponseProtocol {
	// 서버접속
	public static final int RESPONSE_NICK_CHECK_OK = 1000;
	public static final int RESPONSE_NICK_CHECK_NOTIFY = 1101;
	public static final int RESPONSE_NICK_CHECKC_NO = 1102;

	// 채팅 대기실
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
	// 채팅방

	public static final int RESPONSE_MASTER_ENTRUST_OK = 1200;
	public static final int RESPONSE_MASTER_ENTRUST_OK_NOTIFY = 1201;
	public static final int RESPONSE_MASTER_ENTERUST_NO = 1202;
	public static final int RESPONSE_MASTER_ENTRUST_DELIVERY = 1203;
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
	
	// 귓속말
	public static final int RESPONSE_WHISPER_OK = 1301;
	public static final int RESPONSE_WHISPER_NO = 1302;
	//대기실나가기
	public static final int RESPONSE_USER_OUT_OK = 4444;
	public static final int RESPONSE_USER_OUT_UPDATE = 4445;
	
	public static final int RESPONSE_USER_FORCED_EXIT_OK = 1280;
	public static final int RESPONSE_USER_FORCED_EXIT_NOTIFY = 1281;
	public static final int RESPONSE_USER_FORCED_EXIT_NO = 1282;
	
	
}



class RoomCreateFailureException extends RuntimeException {

	private static final long serialVersionUID = -6049451322225179842L;
	int code = ResponseProtocol.RESPONSE_CREATE_CHATTINGROOM_NO;

	public RoomCreateFailureException() {
		super("채팅방 생성에 실패하였습니다.");
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




class TotalPeopleDlg extends JDialog {
	private JButton btnClose;

	private JPanel pnlCenter = new JPanel(new BorderLayout());
	
	private JPanel pnlCCenter = new JPanel();
	private JScrollPane scroll = new JScrollPane(pnlCCenter);
	private JPanel pnlSouth = new JPanel();
	private ObjectOutputStream oos;
	private ChattingRoomFrame chattingRoomFrame;


	public TotalPeopleDlg(ChattingRoomFrame chattingRoomFrame, ObjectOutputStream oos) {
		super(chattingRoomFrame);
		this.chattingRoomFrame = chattingRoomFrame;
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.oos = oos;
		init();
		setDisplay();
		addListeners();
		showFrame();
	}

	private void init() {
		btnClose = new JButton("닫기");
	}

	private void setDisplay() {
		pnlCCenter.setBackground(Color.WHITE);
		pnlCCenter.setPreferredSize(new Dimension(80, 0));
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setPreferredSize(new Dimension(200, 160));
		
		pnlCenter.add(scroll, BorderLayout.CENTER);
		pnlSouth.setBackground(Color.WHITE);

		pnlSouth.add(btnClose);

		getContentPane().add(pnlCenter, BorderLayout.NORTH);
		getContentPane().add(pnlSouth, BorderLayout.CENTER);
	}

	public void setUserlist(Client[] c) {
		int width = pnlCCenter.getWidth();
		int height = 0;
		pnlCCenter.removeAll();
		pnlCCenter.repaint();
		for (int i = 0; i < c.length; i++) {
			UserInfoPanel uip = new UserInfoPanel(c[i].getNickName(), c[i].getGender(), oos);
			uip.getMiInvite().setVisible(true);
			uip.setTotalPeopleDlg(this);
			uip.setChattingRoomFrame(chattingRoomFrame);
			pnlCCenter.add(uip);
			pnlCCenter.setPreferredSize(new Dimension(width, height += 35));
		}
		pnlCCenter.revalidate();
	}

	private void addListeners() {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		};
		btnClose.addActionListener(listener);
	}

	private void showFrame() {
		setTitle("전체인원 확인");
		setSize(150, 230);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}



class UserInfoPanel extends JPanel {
	private JLabel lblUser;
	private JLabel lblGender;
	private JPanel pnlHost;
	private JPopupMenu jmenu;
	private JMenuItem miInvite;
	private JMenuItem miWisper;
	private JMenuItem miPass;
	private JMenuItem miKick;

	private String nickName;
	private String gender;
	private ObjectOutputStream oos;

	private TotalPeopleDlg totalPeopleDlg;

	private MainFrame mainFrame;
	private ChattingRoomFrame chattingRoomFrame;

	public UserInfoPanel(String nickName, String gender, ObjectOutputStream oos) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}
		this.oos = oos;
		this.nickName = nickName;
		this.gender = gender;
		init();
		addListeners();
		setDisplay();
	}

	public UserInfoPanel(ChattingRoomFrame chattingRoomFrame) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}
		this.chattingRoomFrame = chattingRoomFrame;
		init();
		addListeners();
		setDisplay();
	}

	public MainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public ChattingRoomFrame getChattingRoomFrame() {
		return chattingRoomFrame;
	}

	public void setChattingRoomFrame(ChattingRoomFrame chattingRoomFrame) {
		this.chattingRoomFrame = chattingRoomFrame;
	}

	public JMenuItem getMiInvite() {
		return miInvite;
	}

	public void setMiInvite(JMenuItem miInvite) {
		this.miInvite = miInvite;
	}

	public JMenuItem getMiWisper() {
		return miWisper;
	}

	public void setMiWisper(JMenuItem miWisper) {
		this.miWisper = miWisper;
	}

	public TotalPeopleDlg getTotalPeopleDlg() {
		return totalPeopleDlg;
	}

	public void setTotalPeopleDlg(TotalPeopleDlg totalPeopleDlg) {
		this.totalPeopleDlg = totalPeopleDlg;
	}

	public JMenuItem getMiPass() {
		return miPass;
	}

	public void setMiPass(JMenuItem miPass) {
		this.miPass = miPass;
	}

	public JPopupMenu getJmenu() {
		return jmenu;
	}

	public void setJmenu(JPopupMenu jmenu) {
		this.jmenu = jmenu;
	}

	public void setMaster() {
		JLabel lblHost = new JLabel(new ImageIcon("왕관.PNG"));
		pnlHost.add(lblHost);
	}

	public JMenuItem getMiKick() {
		return miKick;
	}

	public void setMiKick(JMenuItem miKick) {
		this.miKick = miKick;
	}

	private void addListeners() {
		lblUser.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseReleased(MouseEvent me) {
				if (jmenu != null) {
					showPopup(me);
				}
			}

			@Override
			public void mousePressed(MouseEvent me) {
				if (jmenu != null) {
					showPopup(me);
				}
			}
		});
		ActionListener listener = (e) -> {
			Object obj = e.getSource();
			JMenuItem temp = (JMenuItem) obj;
			if (temp == miWisper) {

				String text = lblUser.getText();
				String msg = "/w " + text + " ";
				if (chattingRoomFrame != null) {
					chattingRoomFrame.addTfInput(msg);
				} else {
					mainFrame.addTfInput(msg);
				}

			} else if (temp == miPass) {
				String name = lblUser.getText();

				try {
					oos.writeObject(new PushDataDTO(RequestProtocol.REQUEST_MASTER_ENTRUST, name));
					oos.flush();
					oos.reset();
				} catch (IOException e2) {
					e2.printStackTrace();
				}

			} else if (temp == miInvite) {
				PushDataDTO dataDTO;
				int current = chattingRoomFrame.getCurrentC();
				int limit = chattingRoomFrame.getLimitC();
				if (current < limit) {
					dataDTO = new PushDataDTO(RequestProtocol.REQUEST_USER_INVITE, nickName);
					System.out.println("초대 할 닉네임 : " + nickName);
					try {
						oos.writeObject(dataDTO);
						oos.flush();
						oos.reset();

						totalPeopleDlg.dispose();
						totalPeopleDlg = null;
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(chattingRoomFrame, "인원이 가득차서 초대할 수 없습니다.");
				}
			}
		};
		miInvite.addActionListener(listener);
		miWisper.addActionListener(listener);
		miPass.addActionListener(listener);

		miKick.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				try {
					String user = lblUser.getText();

					oos.writeObject(new PushDataDTO(RequestProtocol.REQUEST_USER_FORCED_EXIT, user));
					oos.flush();
					oos.reset();
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}

	public void init() {
		jmenu = new JPopupMenu();
		miInvite = new JMenuItem("초대");
		miWisper = new JMenuItem("귓속말");
		miPass = new JMenuItem("방장위임");
		miKick = new JMenuItem("강퇴");
		miPass.setVisible(false);
		miInvite.setVisible(false);
		miKick.setVisible(false);
		lblUser = new JLabel(nickName);
		lblUser.setOpaque(true);
		lblUser.setBackground(Color.WHITE);
		if (gender.equals("여자")) {
			lblGender = new JLabel(new ImageIcon("여자.PNG"));
			lblGender.setOpaque(true);
			lblGender.setBackground(Color.WHITE);
		} else {
			lblGender = new JLabel(new ImageIcon("남자.PNG"));
			lblGender.setOpaque(true);
			lblGender.setBackground(Color.WHITE);
		}

		// lblGender = new JLabel(gender);

	}

	public void showPopup(MouseEvent me) {
		jmenu.show(me.getComponent(), me.getX(), me.getY());
	}

	public void setDisplay() {
		setOpaque(true);
		setBackground(Color.WHITE);
		jmenu.add(miInvite);
		jmenu.add(miWisper);
		jmenu.add(miPass);
		jmenu.add(miKick);
		add(jmenu);
		setLayout(new BorderLayout(0, 0));
		setPreferredSize(new Dimension(120, 30));
		lblUser.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);

		JPanel pnlUser = new JPanel();
		pnlUser.setPreferredSize(new Dimension(120,20));
		
		
		JPanel pnlGender = new JPanel();

		pnlHost = new JPanel();
		pnlHost.setOpaque(true);
		pnlHost.setBackground(Color.WHITE);
		pnlUser.add(lblUser);
		pnlUser.setOpaque(true);
		pnlUser.setBackground(Color.WHITE);
		pnlGender.add(lblGender);
		pnlGender.setOpaque(true);
		pnlGender.setBackground(Color.WHITE);
		add(pnlUser, BorderLayout.CENTER);
		add(pnlGender, BorderLayout.WEST);
		add(pnlHost, BorderLayout.EAST);
	}

	public void deleteJMenu() {
		jmenu = null;
	}

	public void changeColor() {
		lblUser.setOpaque(true);
		lblUser.setForeground(Color.RED);

		lblGender.setOpaque(true);
		lblGender.setForeground(Color.RED);
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
	private Client[] userList;

	public Client[] getUserList() {
		return userList;
	}
	public void setUserList(Client[] userList) {
		this.userList = userList;
	}
}


public class FirstFrame extends JFrame {
	private JLabel lblNick;
	private JLabel lblServerIp;
	private JLabel lblGender;
	private JLabel lblLogo;
	private JTextField tfNick;
	private JTextField tfServerIp;
	private JRadioButton rbtnMale;
	private JRadioButton rbtnFeMale;
	private JButton btnServerInput;
	private Client client;
	private Socket socket;

	public FirstFrame() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

		} catch (Exception e) {
			e.printStackTrace();
		}
		init();
		setDisplay();
		addListeners();
		showFrame();
		client = new Client();
	}

	private void init() {
		lblNick = new JLabel("닉네임");
		lblServerIp = new JLabel("서버 IP");
		lblGender = new JLabel("성별");
		tfNick = new JTextField(12);
		tfServerIp = new JTextField(12);
		rbtnMale = new JRadioButton("남자");
		rbtnFeMale = new JRadioButton("여자");
		btnServerInput = new JButton("서버 접속");
		lblLogo = new JLabel(new ImageIcon("로고.PNG"));
	}

	private void setDisplay() {
		JPanel mainPnl = new JPanel();
		mainPnl.setBackground(new Color(254, 225, 63));
		mainPnl.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPnl.setLayout(new BorderLayout(0, 0));

		JPanel pnlNorth = new JPanel(new BorderLayout());
		pnlNorth.setBackground(new Color(254, 225, 63));
		JPanel pnlNNickOutSide = new JPanel(new FlowLayout());
		pnlNNickOutSide.setBackground(new Color(254, 225, 63));
		JPanel pnlNNickInSide = new JPanel(new BorderLayout());
		pnlNNickInSide.setBackground(new Color(254, 225, 63));
		pnlNNickInSide.add(lblNick, BorderLayout.WEST);
		pnlNNickInSide.add(tfNick, BorderLayout.EAST);
		pnlNNickOutSide.add(pnlNNickInSide);

		JPanel pnlNServerIpOutSide = new JPanel(new FlowLayout());
		pnlNServerIpOutSide.setBackground(new Color(254, 225, 63));
		JPanel pnlNServerIpInSide = new JPanel(new BorderLayout());
		pnlNServerIpInSide.setBackground(new Color(254, 225, 63));
		pnlNServerIpInSide.add(lblServerIp, BorderLayout.WEST);
		pnlNServerIpInSide.add(tfServerIp, BorderLayout.EAST);

		pnlNServerIpOutSide.add(pnlNServerIpInSide);

		JPanel pnlNGenderOutSide = new JPanel(new FlowLayout());
		pnlNGenderOutSide.setBackground(new Color(254, 225, 63));
		JPanel pnlNGenderInSide = new JPanel(new BorderLayout());
		pnlNGenderInSide.setBackground(new Color(254, 225, 63));
		ButtonGroup group = new ButtonGroup();

		group.add(rbtnFeMale);
		group.add(rbtnMale);

		pnlNGenderOutSide.add(lblGender, BorderLayout.WEST);
		pnlNGenderInSide.add(rbtnMale, BorderLayout.CENTER);
		pnlNGenderInSide.add(rbtnFeMale, BorderLayout.EAST);

		pnlNGenderOutSide.add(pnlNGenderInSide);

		pnlNorth.add(pnlNNickOutSide, BorderLayout.NORTH);
		pnlNorth.add(pnlNServerIpOutSide, BorderLayout.CENTER);
		pnlNorth.add(pnlNGenderOutSide, BorderLayout.SOUTH);

		JPanel pnlCenter = new JPanel();
		pnlCenter.setBackground(new Color(254, 225, 63));
		pnlCenter.add(btnServerInput);

		mainPnl.add(lblLogo, BorderLayout.NORTH);
		mainPnl.add(pnlNorth, BorderLayout.CENTER);
		mainPnl.add(pnlCenter, BorderLayout.SOUTH);

		setContentPane(mainPnl);
	}

	private void addListeners() {
		ActionListener listener = (ae) -> {
			Object src = ae.getSource();
			if (btnServerInput == src) {
				// 입력사항에 이상이없으면 배열에 넣기
				if (tfNick.getText().equals(" ") || tfNick.getText().length() == 0) {
					JOptionPane.showMessageDialog(this, "닉네임을 입력해주세요");
					return;
				}
				
				if (tfNick.getText().length() > 6) {
					JOptionPane.showMessageDialog(this, "6글자 이하로 입력해주세요");
					return;
				}

				if (tfServerIp.getText().equals(" ") || tfServerIp.getText().length() == 0) {
					JOptionPane.showMessageDialog(this, "서버를 입력해주세요");
					return;
				}

				if (!rbtnMale.isSelected() && !rbtnFeMale.isSelected()) {
					JOptionPane.showMessageDialog(this, "성별을 선택하세요");
					return;
				}
				client.setNickName(tfNick.getText());

				String[] data = new String[2];

				data[0] = new String(client.getNickName());
				data[1] = new String(client.getGender());

				try {
					socket = new Socket(tfServerIp.getText(), 10008);
					if (socket.isConnected()) {
						// 서버와 연결된 스트림
						ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
						ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

						// 객체 보내라
						oos.writeObject(new PushDataDTO(RequestProtocol.REQUEST_NICK_CHECK, data));
						oos.flush();
						oos.reset();

						// 리스너 만들고
						ClientThread clientThread = new ClientThread(this, socket, oos, ois);
						clientThread.setName(data[0]);
						clientThread.start();
					}

				} catch (UnknownHostException e) {
					JOptionPane.showMessageDialog(this, "호스트가 존재하지 않음");
				} catch (ConnectException e) {
					JOptionPane.showMessageDialog(this, "서버를 확인하세요");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};

		btnServerInput.addActionListener(listener);
		ActionListener alsnr = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				String s = ae.getActionCommand();

				if (s.equals(rbtnMale.getText())) {
					client.setGender(rbtnMale.getText());
				}
				if (s.equals(rbtnFeMale.getText())) {
					client.setGender(rbtnFeMale.getText());
				}
			}
		};
		rbtnMale.addActionListener(alsnr);
		rbtnFeMale.addActionListener(alsnr);
	}

	private void showFrame() {
		setTitle("채팅서버 로그인");
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FirstFrame();
	}
}
