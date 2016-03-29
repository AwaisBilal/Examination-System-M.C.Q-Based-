
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Properties;

//import javafx.scene.control.DatePicker;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.VBox;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;








import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

//import dum.DateLabelFormatter;



public class gui extends JFrame implements  ItemListener{

	private static final long serialVersionUID = 1L;
	Client c;
	JPanel 	
	basic_panel,
	card_Layout_panel,
	login_panel,
	banner_panel,
	welcome_to_exam_system_card1,
	signup_card2,
	email_sent_card3,
	welcome_card4_panel,
	welcome_card4_user_dp_panel,
	start_paper_card5_panel,
	practice_questions_card6_panel,
	view_result_card7_panel,
	view_result2_card7_panel,
	paper_pin_card9_panel,
	instruction_card10_panel,
	sorry_time_out_card_panel,
	forgot_pass_card_panel,
	forgot_pass_code_card_panel, 
	reset_pass_card_panel; 


	JButton start_paper_card5_back_btn,
	start_paper_card5_start_btn,
	practice_questions_card6_back_btn,
	view_result_card7_back_btn,
	view_result2_card7_back_btn,
	paper_pin_card9_back_btn,
	paper_pin_card9_go_btn,
	login,
	email_sent_card3_submit_btn,
	instruction_card10_go_btn,
	instruction_card10_back_btn, 
	sorry_time_out_exit_btn,
	sorry_time_out_view_result_btn,
	sorry_time_out_back_btn,
	forgot_pass_back_btn,			
	forgot_pass_submit_btn,
	forgot_pass_code_back_btn,
	forgot_pass_code_submit_btn,
	reset_pass_card_submit_btn,
	reset_pass_card_back_btn,
	view_result2_card7_exit_btn; 


	CardLayout basic2;

	JLabel 
	logo_label,
	Label1,
	instruction_lb,
	username_lb,
	password_lb,
	name_label,
	signup_lb,
	email_sent_card3_signup_lb ,
	email_sent_card3_enter_code_lb,
	email_sent_card3_email_sent_lb,
	welcome_subjects_Card4_subjects_lb,
	welcome_subjects_Card4_welcome_lb,
	welcome_subjects_Card4_subject1_lb,
	welcome_subjects_Card4_subject2_lb,
	welcome_subjects_Card4_subject3_lb,
	welcome_subjects_Card4_subject4_lb,
	welcome_subjects_Card4_subject5_lb,
	welcome_subjects_Card4_subject6_lb,
	welcome_card4_user_pic_lb,
	welcome_card4_uob_lb,	
	practice_paper_lb,
	view_result_lb,
	start_paper_card5_panel_subject_name_lb,
	practice_question_card6_subject_name_lb,
	practice_question_card6_practice_lb,
	practice_question_card6_practice_paper1_lb,
	practice_question_card6_practice_paper2_lb,
	practice_question_card6_practice_paper6_lb,
	practice_question_card6_practice_paper5_lb,
	practice_question_card6_practice_paper4_lb,
	practice_question_card6_practice_paper3_lb,
	view_result_card7_panel_subject_name_lb,
	view_result_card7_view_result_lb, 
	view_result_card7_paper1_lb,
	view_result_card7_paper2_lb,
	view_result_card7_paper3_lb,
	view_result_card7_paper4_lb,
	view_result_card7_paper5_lb,
	view_result_card7_paper6_lb,
	view_result2_card7_panel_subject_name_lb,
	view_result2_card7_view_result_lb,
	view_result2_card7_see_details_lb,
	paper_pin_card9_subject_name_lb,
	paper_pin_card9_enter_pin_lb,
	instruction_card10_instructions_lb,
	instruction_card10_instruction_lb,
	sorry_time_out_what_happens_lb, 
	sorry_time_out_subject_name_lb,
	forgot_pass_enter_email_lb, 
	forgot_pass_forgot_lb,
	forgot_pass_code_code_lb ,
	forgot_pass_code_code_instructions_lb,
	forgot_pass_code_forgot_lb,
	reset_pass_card_enter_pas_lb ,
	reset_pass_card_reset_pas_lb,
	reset_pass_card_confirm_pas_lb,
	view_result2_card7_marks_lb,
	view_result2_card7_acquire_marks_lb,
	view_result2_card7_marks_out_lb,
	view_result2_card7_total_marks_lb,
	view_result2_card7_percentage_lb,
	view_result2_card7_percent_lb;



	JTextField
	username_jtf,
	code_jtf,
	paper_pin_card9_paper_pin_jtf,
	forgot_pass_email_jtf,
	forgot_pass_code_jtf, 
	reset_pass_card_confirm_pas_jtf,
	reset_pass_card_enter_pas_jtf;

	JPasswordField
	password_jtf;

	////////////////////////////////////////////
	///////////Teacher View ///////////////////
	//////////////////////////////////////////

	JPanel 	teacher_welcome_card_panel,
	create_paper_card_panel,
	paper_duration_panel, 
	negative_marking_panel,
	no_of_question_per_paper_panel, 
	marks_per_question_panel,
	grade_num_panel,
	set_instructions_by_teacher_card_panel,
	mcq_card_panel,
	create_paper_by_teacher_card_panel,
	view_papers_card_panel;



	JLabel teacher_welcome_card_drafts_lb,
	teacher_welcome_card_view_results_lb,
	teacher_welcome_card_view_papers_lb	,		
	teacher_welcome_card_create_paper_lb,
	teacher_welcome_card_welcome_lb,
	create_paper_select_paper_name_lb,
	create_paper_select_subject_lb,
	create_paper_create_lb,
	create_paper_paper_graded_papr_lb,
	create_paper_paper_no_of_questions_lb,
	create_paper_paper_no_of_marks_per_questions_lb, 
	create_paper_paper_negative_marking_lb,
	create_paper_paper_Paper_time_lb,
	create_paper_paper_paper_date_lb,
	create_paper_paper_duration_lb,
	create_paper_paper_marks_per_question_lb,	
	set_instructions_by_teacher_set_instructions_lb,
	set_instructions_by_teacher_create_paper_lb,	
	mcq_card_panel_subject_name_lb,
	mcq_card_panel_examination_lb,
	mcq_card_panel_some_instructions_abt_exami_lb, 
	mcq_card_panel_current_question_lb ,
	mcq_card_panel_total_question_lb,
	mcq_card_panel_question_lb,
	mcq_card_panel_question_content_lb, 
	mcq_card_panel_picture_lb,
	create_paper_by_teacher_card_name_lb, 
	create_paper_by_teacher_card_examination_lb,
	create_paper_by_teacher_card_current_question_lb,
	create_paper_by_teacher_card_total_question_lb,
	create_paper_by_teacher_card_question_lb,
	create_paper_by_teacher_card_picture_lb,
	view_papers_card_subject_name_lb,
	view_papers_card_paper1_lb,
	view_papers_card_paper2_lb,
	view_papers_card_paper3_lb,
	view_papers_card_paper4_lb,
	view_papers_card_paper5_lb,
	view_papers_card_paper6_lb;

	JTextField create_paper_paper_name_jtf,
	create_paper_by_teacher_card_question_content_jtf,
	create_paper_by_teacher_opt1_jtf,
	create_paper_by_teacher_opt2_jtf,
	create_paper_by_teacher_opt3_jtf,
	create_paper_by_teacher_opt4_jtf;

	JTextArea set_instructions_by_teacher_set_instructions_jta;

	JButton create_paper_card_submit_btn,
	create_paper_card_back_btn,
	set_instructions_by_teacher_submit_btn,
	set_instructions_by_teacher_card_back_btn,
	mcq_card_back_btn, 
	mcq_card_pic_upload_btn, 
	mcq_card_next_btn, 
	mcq_card_exit_btn,
	mcq_card_previous_btn,
	create_paper_by_teacher_card_back_btn,
	create_paper_by_teacher_pic_upload_btn,
	create_paper_by_teacher_next_btn,
	create_paper_by_teacher_save_btn,
	create_paper_by_teacher_exit_btn,
	create_paper_by_teacher_previous_btn,
	create_paper_by_teacher_compeleted_btn,
	create_paper_by_clear_radio_btns_btn,
	create_paper_by_teacher_pic_preview_btn,
	view_papers_card_back_btn,
	teacher_welcome_card_create_paper_lb_btn,
	teacher_welcome_card_view_papers_lb_btn ,
	teacher_welcome_card_view_results_lb_btn,
	teacher_welcome_card_drafts_lb_btn;



	JCheckBox negative_marking_box,
	graded_chk_box ;

	ButtonGroup create_paper_by_teacher_bg = new ButtonGroup(); 
	JRadioButton jrb_create_paper_by_teacher[]=new JRadioButton[4];
	ButtonGroup bg = new ButtonGroup(); 
	JRadioButton jrb[]=new JRadioButton[4];

	public gui(){
		c=new Client();
		student_view_gui();
		teacher_view_gui();
		add(basic_panel);
		standard_gui(); 

		//		password_jtf.setFocusable(false);
		//		username_jtf.setFocusable(false);
	}

	public void student_view_gui(){


		basic_panel = new JPanel();
		basic_panel.setLayout(null);
		basic_panel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

		banner_panel = new JPanel();
		banner_panel.setLayout(null);
		banner_panel.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
		//		banner_panel.setSize(680, 200);
		banner_panel.setBounds(0,0,680,200);

		//////Banner inner things//////////////////////////////////////////////////
		logo_label = new JLabel("Logo");
		logo_label.setBounds(30,40,100,100);
		logo_label.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));

		name_label = new JLabel(" Namal Examination System   ");
		name_label.setFont(new Font("Times new Roman",  Font.ITALIC,25));
		name_label.setBounds(200,80,400,50);
		//		name_label.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));

		banner_panel.add(logo_label);
		banner_panel.add(name_label);
		////////////////////////////////////////////////////////////////////////		

		//		basic_panel.add(banner_panel,BorderLayout.NORTH);
		basic_panel.add(banner_panel);





		///////// Card Layout//////////////
		basic2 = new CardLayout();
		card_Layout_panel = new JPanel(basic2);
		card_Layout_panel.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
		card_Layout_panel.setBounds(0, 200, 680, 460);
		basic_panel.add(card_Layout_panel,BorderLayout.CENTER);

		welcome_to_exam_system_card1 = new JPanel();
		welcome_to_exam_system_card1.setLayout(null);
		welcome_to_exam_system_card1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		welcome_to_exam_system_card1.setBounds(0,200,670,460);

		Label1 = new JLabel("Welcome to exam System");
		Label1.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		Label1.setBounds(30,50,400,50);
		welcome_to_exam_system_card1.add(Label1);

		instruction_lb = new JLabel("<html> 1.   It is dummy instruction...<br>"
				+ "2.   It is dummy instruction...<br>"
				+ "3.   It is dummy instruction...<br>"
				+ "4.   It is dummy instruction...<br>"
				+ "5.   It is dummy instruction... </html>");
		instruction_lb.setFont(new Font("Times new Roman", Font.ITALIC,18));
		instruction_lb.setBounds(40,80,350,200);
		welcome_to_exam_system_card1.add(instruction_lb);





		login_panel = new JPanel();
		login_panel.setLayout(null);
		login_panel.setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
		login_panel.setBounds(350,80,300,250);


		username_lb = new JLabel("Username");
		username_lb.setBounds(30, 20, 100, 10);	
		username_jtf = new JTextField();
		//		username_jtf.setUI(new HintUI2("Username", Color.gray));
		username_jtf.setBounds(30,40, 150, 25);

		password_lb = new JLabel("Password");
		password_lb.setBounds(30, 90, 100, 10);
		password_jtf = new JPasswordField();
		//		password_jtf.setUI(new HintUI2("Password", Color.gray));   
		password_jtf.setBounds(30, 110, 150, 25);


		login_panel.add(username_lb);
		login_panel.add(username_jtf);
		login_panel.add(password_lb);
		login_panel.add(password_jtf);

		login = new JButton("Login");
		login.setBounds(30, 140, 110, 30);
		login.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				if (source == login){
//					c = new Client();
					String role= c.login(username_jtf.getText(), password_jtf.getText());
					System.out.println(role);
					basic2.show(card_Layout_panel, "teacher_welcome_card_panel");
				}
			}
		});


		login_panel.add(login);

		try {
			@SuppressWarnings("unused")
			final URI uri = new URI("http://www.google.com");
			JLabel forgotpassword = new JLabel();
			forgotpassword.setText("<html> Website : <a href=\"\">http://www.google.com/</a></html>");
			//	        forgotpassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
			forgotpassword.setBounds(30, 200, 110, 30);
			//			login_panel.add(forgotpassword);

		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		welcome_to_exam_system_card1.add(login_panel);
		card_Layout_panel.add(welcome_to_exam_system_card1, "1");









		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		signup_card2 = new JPanel();
		signup_card2.setLayout(null);
		signup_card2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		signup_card2.setBounds(0,200,670,460);
		signup_lb = new JLabel("Sigh Up");
		signup_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,20));
		signup_lb.setBounds(270,20,100,50);
		signup_card2.add(signup_lb);


		JTextField signup_card2_name_jtf, signup_card2_username_jtf, signup_card2_email_jtf, signup_card2_signup_as_jtf;
		JPasswordField password;




		card_Layout_panel.add(signup_card2, "signup_card2");
		/////////////////////////////////////////////////////////////////////////


		//////////Email Has been sent Card/////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		email_sent_card3 = new JPanel();
		email_sent_card3.setLayout(null);
		email_sent_card3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		email_sent_card3.setBounds(0,200,670,460);

		email_sent_card3_signup_lb = new JLabel("Sigh Up");
		email_sent_card3_signup_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,20));
		email_sent_card3_signup_lb.setBounds(20,20,150,50);
		email_sent_card3.add(email_sent_card3_signup_lb);


		email_sent_card3_email_sent_lb = new JLabel("An Email Has been sent to your Email ID... ");
		email_sent_card3_email_sent_lb.setFont(new Font("Times new Roman",  Font.ITALIC,18));
		email_sent_card3_email_sent_lb.setBounds(100,100,350,50);
		email_sent_card3.add(email_sent_card3_email_sent_lb);


		email_sent_card3_enter_code_lb = new JLabel("Enter Code");
		email_sent_card3_enter_code_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,20));
		email_sent_card3_enter_code_lb.setBounds(100,150,150,50);
		email_sent_card3.add(email_sent_card3_enter_code_lb);


		code_jtf = new JTextField();
		code_jtf.setBounds(100, 210, 150, 30);	
		email_sent_card3.add(code_jtf);

		email_sent_card3_submit_btn = new JButton("Submit");
		email_sent_card3_submit_btn.setBounds(100, 260, 100, 30);
		email_sent_card3_submit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == login){
					basic2.show(card_Layout_panel, "");
				}
			}
		});

		email_sent_card3.add(email_sent_card3_submit_btn);

		card_Layout_panel.add(email_sent_card3, "email_sent_card3");
		/////////////////////////////////////////////////////////////////////////


		//////////////////////Welcome Subjects Cards  ////////////////////////////////////////////////////////////

		welcome_card4_panel = new JPanel();
		welcome_card4_panel.setLayout(null);
		welcome_card4_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		welcome_card4_panel.setBounds(0,200,670,460);

		welcome_card4_user_dp_panel = new JPanel();
		welcome_card4_user_dp_panel.setLayout(null);
		welcome_card4_user_dp_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		welcome_card4_user_dp_panel.setBounds(530,150,150,50);

		welcome_card4_user_pic_lb = new JLabel("DP");
		welcome_card4_user_pic_lb.setBounds(120,10,20,20);
		welcome_card4_user_dp_panel.add(welcome_card4_user_pic_lb);

		welcome_card4_uob_lb = new JLabel("13031124");
		welcome_card4_uob_lb.setBounds(0,10,70,20);
		welcome_card4_user_dp_panel.add(welcome_card4_uob_lb);

		banner_panel.add(welcome_card4_user_dp_panel);


		welcome_subjects_Card4_welcome_lb = new JLabel("Welcome");
		welcome_subjects_Card4_welcome_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		welcome_subjects_Card4_welcome_lb.setBounds(300,20,150,50);
		welcome_card4_panel.add(welcome_subjects_Card4_welcome_lb);


		welcome_subjects_Card4_subjects_lb = new JLabel("Subjects");
		welcome_subjects_Card4_subjects_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		welcome_subjects_Card4_subjects_lb.setBounds(320,60,150,50);
		welcome_card4_panel.add(welcome_subjects_Card4_subjects_lb);

		welcome_subjects_Card4_subject1_lb = new JLabel("Subject 1");
		welcome_subjects_Card4_subject1_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		welcome_subjects_Card4_subject1_lb.setBounds(100,200,150,50);
		welcome_card4_panel.add(welcome_subjects_Card4_subject1_lb);

		welcome_subjects_Card4_subject2_lb = new JLabel("Subject 2");
		welcome_subjects_Card4_subject2_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		welcome_subjects_Card4_subject2_lb.setBounds(300,200,150,50);
		welcome_card4_panel.add(welcome_subjects_Card4_subject2_lb);

		welcome_subjects_Card4_subject3_lb = new JLabel("Subject 3");
		welcome_subjects_Card4_subject3_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		welcome_subjects_Card4_subject3_lb.setBounds(500,200,150,50);
		welcome_card4_panel.add(welcome_subjects_Card4_subject3_lb);

		welcome_subjects_Card4_subject4_lb = new JLabel("Subject 4");
		welcome_subjects_Card4_subject4_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		welcome_subjects_Card4_subject4_lb.setBounds(100,300,150,50);
		welcome_card4_panel.add(welcome_subjects_Card4_subject4_lb);

		welcome_subjects_Card4_subject5_lb = new JLabel("Subject 5");
		welcome_subjects_Card4_subject5_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		welcome_subjects_Card4_subject5_lb.setBounds(300,300,150,50);
		welcome_card4_panel.add(welcome_subjects_Card4_subject5_lb);

		welcome_subjects_Card4_subject6_lb = new JLabel("Subject 6");
		welcome_subjects_Card4_subject6_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		welcome_subjects_Card4_subject6_lb.setBounds(500,300,150,50);
		welcome_card4_panel.add(welcome_subjects_Card4_subject6_lb);

		card_Layout_panel.add(welcome_card4_panel, "welcome_card4_panel");
		///////////////////////////////////////////////////////////


		///////Start Paper Card//////////////////////////////////////////////

		start_paper_card5_panel = new JPanel();
		start_paper_card5_panel.setLayout(null);
		start_paper_card5_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		start_paper_card5_panel.setBounds(0,200,670,460);

		start_paper_card5_panel_subject_name_lb = new JLabel("Subject");
		start_paper_card5_panel_subject_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		start_paper_card5_panel_subject_name_lb.setBounds(300,20,150,50);
		start_paper_card5_panel.add(start_paper_card5_panel_subject_name_lb);

		start_paper_card5_back_btn = new JButton("Back");
		start_paper_card5_back_btn.setBounds(10, 10, 70, 30);
		start_paper_card5_panel.add(start_paper_card5_back_btn);
		start_paper_card5_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == start_paper_card5_back_btn){
					basic2.show(card_Layout_panel, "welcome_card4_panel");
				}
			}
		});



		start_paper_card5_start_btn = new JButton("Start Paper");
		start_paper_card5_start_btn.setBounds(50, 100, 160, 50);
		start_paper_card5_start_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == start_paper_card5_start_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		start_paper_card5_panel.add(start_paper_card5_start_btn);

		practice_paper_lb = new JLabel("Practice Paper");
		practice_paper_lb.setBounds(100, 250, 100, 50);
		start_paper_card5_panel.add(practice_paper_lb);

		view_result_lb= new JLabel("View Result");
		view_result_lb.setBounds(400, 250, 100, 50);
		start_paper_card5_panel.add(view_result_lb);

		card_Layout_panel.add(start_paper_card5_panel, "start_paper_card5_panel");

		//////////////////////////////////////////////////////////////////////

		///////Practice Paper Card////////
		practice_questions_card6_panel = new JPanel();
		practice_questions_card6_panel.setLayout(null);
		practice_questions_card6_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		practice_questions_card6_panel.setBounds(0,200,670,460);

		practice_question_card6_subject_name_lb = new JLabel("Subject Name");
		practice_question_card6_subject_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		practice_question_card6_subject_name_lb.setBounds(300,20,150,50);
		practice_questions_card6_panel.add(practice_question_card6_subject_name_lb);


		practice_question_card6_practice_lb = new JLabel("Practice Papers");
		practice_question_card6_practice_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		practice_question_card6_practice_lb.setBounds(320,60,150,50);
		practice_questions_card6_panel.add(welcome_subjects_Card4_subjects_lb);

		practice_questions_card6_back_btn = new JButton("Back");
		practice_questions_card6_back_btn.setBounds(10, 10, 70, 30);
		practice_questions_card6_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == practice_questions_card6_back_btn){
					basic2.show(card_Layout_panel, "start_paper_card5_panel");
				}
			}
		});
		practice_questions_card6_panel.add(practice_questions_card6_back_btn);

		practice_question_card6_practice_paper1_lb = new JLabel("Practice Paper 1");
		practice_question_card6_practice_paper1_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		practice_question_card6_practice_paper1_lb.setBounds(100,200,150,50);
		practice_questions_card6_panel.add(practice_question_card6_practice_paper1_lb);

		practice_question_card6_practice_paper2_lb = new JLabel("Practice Paper 2");
		practice_question_card6_practice_paper2_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		practice_question_card6_practice_paper2_lb.setBounds(300,200,150,50);
		practice_questions_card6_panel.add(practice_question_card6_practice_paper2_lb);

		practice_question_card6_practice_paper3_lb = new JLabel("Practice Paper 3");
		practice_question_card6_practice_paper3_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		practice_question_card6_practice_paper3_lb.setBounds(500,200,150,50);
		practice_questions_card6_panel.add(practice_question_card6_practice_paper3_lb);


		practice_question_card6_practice_paper4_lb = new JLabel("Practice Paper 4");
		practice_question_card6_practice_paper4_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		practice_question_card6_practice_paper4_lb.setBounds(100,300,150,50);
		practice_questions_card6_panel.add(practice_question_card6_practice_paper4_lb);

		practice_question_card6_practice_paper5_lb = new JLabel("Practice Paper 5");
		practice_question_card6_practice_paper5_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		practice_question_card6_practice_paper5_lb.setBounds(300,300,150,50);
		practice_questions_card6_panel.add(practice_question_card6_practice_paper5_lb);

		practice_question_card6_practice_paper6_lb = new JLabel("Practice Paper 6");
		practice_question_card6_practice_paper6_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		practice_question_card6_practice_paper6_lb.setBounds(500,300,150,50);
		practice_questions_card6_panel.add(practice_question_card6_practice_paper6_lb);

		card_Layout_panel.add(practice_questions_card6_panel,"practice_questions_card6_panel");

		///////////////////////////////////////////////////////////

		///////View Result Card////////
		view_result_card7_panel = new JPanel();
		view_result_card7_panel.setLayout(null);
		view_result_card7_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		view_result_card7_panel.setBounds(0,200,670,460);

		view_result_card7_panel_subject_name_lb = new JLabel("Subject Name");
		view_result_card7_panel_subject_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		view_result_card7_panel_subject_name_lb.setBounds(300,20,150,50);
		view_result_card7_panel.add(view_result_card7_panel_subject_name_lb);


		view_result_card7_view_result_lb = new JLabel("View Result");
		view_result_card7_view_result_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card7_view_result_lb.setBounds(320,60,150,50);
		view_result_card7_panel.add(view_result_card7_view_result_lb);

		view_result_card7_back_btn = new JButton("Back");
		view_result_card7_back_btn.setBounds(10, 10, 70, 30);
		view_result_card7_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == view_result_card7_back_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		view_result_card7_panel.add(view_result_card7_back_btn);

		view_result_card7_paper1_lb = new JLabel("Paper 1");
		view_result_card7_paper1_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card7_paper1_lb.setBounds(100,200,150,50);
		view_result_card7_panel.add(view_result_card7_paper1_lb);

		view_result_card7_paper2_lb = new JLabel("Paper 2");
		view_result_card7_paper2_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card7_paper2_lb.setBounds(300,200,150,50);
		view_result_card7_panel.add(view_result_card7_paper2_lb);

		view_result_card7_paper3_lb = new JLabel("Paper 3");
		view_result_card7_paper3_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card7_paper3_lb.setBounds(500,200,150,50);
		view_result_card7_panel.add(view_result_card7_paper3_lb);


		view_result_card7_paper4_lb = new JLabel("Paper 4");
		view_result_card7_paper4_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card7_paper4_lb.setBounds(100,300,150,50);
		view_result_card7_panel.add(view_result_card7_paper4_lb);

		view_result_card7_paper5_lb = new JLabel("Paper 5");
		view_result_card7_paper5_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card7_paper5_lb.setBounds(300,300,150,50);
		view_result_card7_panel.add(view_result_card7_paper5_lb);

		view_result_card7_paper6_lb = new JLabel("Paper 6");
		view_result_card7_paper6_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card7_paper6_lb.setBounds(500,300,150,50);
		view_result_card7_panel.add(view_result_card7_paper6_lb);

		card_Layout_panel.add(view_result_card7_panel,"view_result_card7_panel");

		///////////////////////////////////////////////////////////


		/////////////////////////////////////////////////////////////////////////////////



		///////View Result Card2////////
		view_result2_card7_panel = new JPanel();
		view_result2_card7_panel.setLayout(null);
		view_result2_card7_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		view_result2_card7_panel.setBounds(0,200,670,460);

		view_result2_card7_panel_subject_name_lb = new JLabel("Subject Name");
		view_result2_card7_panel_subject_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		view_result2_card7_panel_subject_name_lb.setBounds(300,20,150,50);
		view_result2_card7_panel.add(view_result2_card7_panel_subject_name_lb);


		view_result2_card7_view_result_lb = new JLabel("View Result");
		view_result2_card7_view_result_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result2_card7_view_result_lb.setBounds(320,60,150,50);
		view_result2_card7_panel.add(view_result2_card7_view_result_lb);

		view_result2_card7_see_details_lb = new JLabel("Some Details about paper");
		view_result2_card7_see_details_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,14));
		view_result2_card7_see_details_lb.setBounds(300,90,150,50);
		view_result2_card7_panel.add(view_result2_card7_see_details_lb);

		view_result2_card7_back_btn = new JButton("Back");
		view_result2_card7_back_btn.setBounds(10, 10, 70, 30);
		view_result2_card7_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == view_result2_card7_back_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		view_result2_card7_panel.add(view_result2_card7_back_btn);

		////////////////////////////////////////////////////////
		///////  Table ////////////////////////////////////////
		// Create a panel to hold all other components
		JPanel topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		//			topPanel.setSize(200, 200);
		topPanel.setBounds(200, 200, 300, 120);
		getContentPane().add( topPanel );

		// Create columns names
		String columnNames[] = { "Discription", "Quantity" };

		// Create some data
		String dataValues[][] =
			{
					{ "Total Question", "100"},
					{ "Attempted",      "90" },
					{ "Not Attempted",  "10"  },
					{ "Correct Answers","90"  },
					{ "Wrong Answers", "90"  },
					{ "Time Consumed", "90 min"  }
			};

		// Create a new table instance
		JTable table = new JTable( dataValues, columnNames );

		// Add the table to a scrolling pane
		JScrollPane scrollPane = new JScrollPane( table );
		topPanel.add( scrollPane, BorderLayout.CENTER );
		view_result2_card7_panel.add(topPanel);
		//////////////////////////////////////////////////////
		////////////////////////////////////////////////////
		view_result2_card7_marks_lb = new JLabel("Marks : ");
		view_result2_card7_marks_lb.setBounds(260,320,50,20);
		view_result2_card7_panel.add(view_result2_card7_marks_lb);

		view_result2_card7_acquire_marks_lb = new JLabel("80");
		view_result2_card7_acquire_marks_lb.setBounds(310,320,50,20);
		view_result2_card7_panel.add(view_result2_card7_acquire_marks_lb);

		view_result2_card7_marks_out_lb = new JLabel("Out of ");
		view_result2_card7_marks_out_lb.setBounds(330,320,50,20);
		view_result2_card7_panel.add(view_result2_card7_marks_out_lb);

		view_result2_card7_total_marks_lb = new JLabel("100");
		view_result2_card7_total_marks_lb.setBounds(370,320,50,20);
		view_result2_card7_panel.add(view_result2_card7_total_marks_lb);

		view_result2_card7_percentage_lb = new JLabel("Percentage : ");
		view_result2_card7_percentage_lb.setBounds(260,340,80,20);
		view_result2_card7_panel.add(view_result2_card7_percentage_lb);

		view_result2_card7_percentage_lb = new JLabel("80");
		view_result2_card7_percentage_lb.setBounds(350,340,80,20);
		view_result2_card7_panel.add(view_result2_card7_percentage_lb);

		view_result2_card7_exit_btn = new JButton("Exit");
		view_result2_card7_exit_btn.setBounds(550, 400, 70, 30);
		view_result2_card7_exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == view_result2_card7_exit_btn){
					System.exit(0);
				}
			}
		});
		view_result2_card7_panel.add(view_result2_card7_exit_btn);


		card_Layout_panel.add(view_result2_card7_panel,"view_result2_card7_panel");

		////////////////////////////////////////////////////////////////////

		///////Paper Pin Card////////

		paper_pin_card9_panel = new JPanel();
		paper_pin_card9_panel.setLayout(null);
		paper_pin_card9_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		paper_pin_card9_panel.setBounds(0,200,670,460);

		paper_pin_card9_subject_name_lb = new JLabel("Subject Name");
		paper_pin_card9_subject_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		paper_pin_card9_subject_name_lb.setBounds(300,20,150,50);
		paper_pin_card9_panel.add(paper_pin_card9_subject_name_lb);

		paper_pin_card9_back_btn = new JButton("Back");
		paper_pin_card9_back_btn.setBounds(10, 10, 70, 30);
		paper_pin_card9_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == paper_pin_card9_back_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		paper_pin_card9_panel.add(paper_pin_card9_back_btn);

		paper_pin_card9_enter_pin_lb = new JLabel("Enter Paper Pin code");
		paper_pin_card9_enter_pin_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		paper_pin_card9_enter_pin_lb.setBounds(100,200,200,50);
		paper_pin_card9_panel.add(paper_pin_card9_enter_pin_lb);

		paper_pin_card9_paper_pin_jtf = new JTextField();
		paper_pin_card9_paper_pin_jtf.setBounds(100,250,200,30);
		paper_pin_card9_panel.add(paper_pin_card9_paper_pin_jtf);

		paper_pin_card9_go_btn = new JButton("Go");
		paper_pin_card9_go_btn.setBounds(230, 290, 70, 30);
		paper_pin_card9_go_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == paper_pin_card9_go_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		paper_pin_card9_panel.add(paper_pin_card9_go_btn);


		card_Layout_panel.add(paper_pin_card9_panel,"paper_pin_card9_panel");
		/////////////////////////////////////////////////////////////////////////


		///////Instruction Card////////

		instruction_card10_panel = new JPanel();
		instruction_card10_panel.setLayout(null);
		instruction_card10_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		instruction_card10_panel.setBounds(0,200,670,460);

		instruction_card10_instruction_lb = new JLabel("Instructions");
		instruction_card10_instruction_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		instruction_card10_instruction_lb.setBounds(300,20,150,50);
		instruction_card10_panel.add(instruction_card10_instruction_lb);

		instruction_card10_back_btn = new JButton("Back");
		instruction_card10_back_btn.setBounds(10, 10, 70, 30);
		instruction_card10_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == instruction_card10_back_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		instruction_card10_panel.add(instruction_card10_back_btn);

		instruction_card10_instructions_lb = new JLabel(
				"<html> 1.   It is dummy instruction.It is dummy instruction.It is dummy instruction.<br><br>"
						+ "2.   It is dummy instruction.It is dummy instruction.It is dummy instruction.<br><br>"
						+ "3.   It is dummy instruction.It is dummy instruction.It is dummy instruction.<br><br>"
						+ "4.   It is dummy instruction.It is dummy instruction.It is dummy instruction.<br><br>"
						+ "5.   It is dummy instruction.It is dummy instruction.It is dummy instruction.<br><br>"
						+ "6.   It is dummy instruction.It is dummy instruction.It is dummy instruction.<br><br>"
						+ "7.   It is dummy instruction.It is dummy instruction.It is dummy instruction.<br><br>"
						+ "8.   It is dummy instruction.It is dummy instruction.It is dummy instruction.<br><br>"
						+ "9.   It is dummy instruction.It is dummy instruction.It is dummy instruction.<br><br>"
						+ "10.   It is dummy instruction.It is dummy instruction.It is dummy instruction. </html>");
		instruction_card10_instructions_lb.setBounds(100,30,600,400);
		instruction_card10_panel.add(instruction_card10_instructions_lb);


		instruction_card10_go_btn = new JButton("Go");
		instruction_card10_go_btn.setBounds(590, 410, 70, 30);
		instruction_card10_go_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == instruction_card10_go_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		instruction_card10_panel.add(instruction_card10_go_btn);


		card_Layout_panel.add(instruction_card10_panel,"instruction_card10_panel");
		/////////////////////////////////////////////////////////////////////////////////



		///////MCQ'S Card////////

		mcq_card_panel = new JPanel();
		mcq_card_panel.setLayout(null);
		mcq_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		mcq_card_panel.setBounds(0,200,670,460);

		mcq_card_back_btn = new JButton("Back");
		mcq_card_back_btn.setBounds(10, 10, 70, 30);
		mcq_card_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == mcq_card_back_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		mcq_card_panel.add(mcq_card_back_btn);

		JLabel mcq_card_panel_time1_lb,
		mcq_card_panel_time2_lb,
		mcq_card_panel_time3_lb,
		mcq_card_panel_time4_lb;

		mcq_card_panel_time1_lb = new JLabel("0");
		mcq_card_panel_time1_lb.setFont(new Font("Times new Roman", Font.BOLD,22));
		mcq_card_panel_time1_lb.setBounds(550,20,20,20);
		mcq_card_panel.add(mcq_card_panel_time1_lb);

		mcq_card_panel_time2_lb = new JLabel("2:");
		mcq_card_panel_time2_lb.setFont(new Font("Times new Roman", Font.BOLD,22));
		mcq_card_panel_time2_lb.setBounds(570,20,20,20);
		mcq_card_panel.add(mcq_card_panel_time2_lb);

		mcq_card_panel_time3_lb = new JLabel("3");
		mcq_card_panel_time3_lb.setFont(new Font("Times new Roman", Font.BOLD,22));
		mcq_card_panel_time3_lb.setBounds(590,20,20,20);
		mcq_card_panel.add(mcq_card_panel_time3_lb);

		mcq_card_panel_time4_lb = new JLabel("8");
		mcq_card_panel_time4_lb.setFont(new Font("Times new Roman", Font.BOLD,22));
		mcq_card_panel_time4_lb.setBounds(610,20,20,20);
		mcq_card_panel.add(mcq_card_panel_time4_lb);

		mcq_card_panel_subject_name_lb = new JLabel("Subject Name");
		mcq_card_panel_subject_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		mcq_card_panel_subject_name_lb.setBounds(240,20,150,50);
		mcq_card_panel.add(mcq_card_panel_subject_name_lb);

		mcq_card_panel_examination_lb = new JLabel("Examination");
		mcq_card_panel_examination_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,20));
		mcq_card_panel_examination_lb.setBounds(250,50,150,50);
		mcq_card_panel.add(mcq_card_panel_examination_lb);


		mcq_card_panel_some_instructions_abt_exami_lb = new JLabel(
				"<html> It is dummy instruction.It is dummy instruction.It is dummy instruction.<br> </html>");
		mcq_card_panel_some_instructions_abt_exami_lb.setBounds(160,80,300,50);
		mcq_card_panel.add(mcq_card_panel_some_instructions_abt_exami_lb);

		mcq_card_panel_current_question_lb = new JLabel("C ");
		//		mcq_card_panel_current_question_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		mcq_card_panel_current_question_lb.setBounds(30,200,20,20);
		mcq_card_panel.add(mcq_card_panel_current_question_lb);

		mcq_card_panel_total_question_lb = new JLabel("/ " + "T" );
		//		mcq_card_panel_total_question_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		mcq_card_panel_total_question_lb.setBounds(50,200,20,20);
		mcq_card_panel.add(mcq_card_panel_total_question_lb);

		mcq_card_panel_question_lb = new JLabel("Question :");
		mcq_card_panel_question_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,15));
		mcq_card_panel_question_lb.setBounds(80,200,400,20);
		mcq_card_panel.add(mcq_card_panel_question_lb);

		mcq_card_panel_question_content_lb = new JLabel("It is a dummy question.........................");
		mcq_card_panel_question_content_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		mcq_card_panel_question_content_lb.setBounds(160,200,400,20);
		mcq_card_panel.add(mcq_card_panel_question_content_lb);

		JPanel radioPanel = new JPanel();
		radioPanel.setLayout(null);
		radioPanel.setBounds(30,250,200,150);
		//		radioPanel.setBackground(Color.BLUE);

		jrb[0]=new JRadioButton("Option 1111111111");
		jrb[1]=new JRadioButton("Option 2222232222");
		jrb[2]=new JRadioButton("Option 3333333333");
		jrb[3]=new JRadioButton("Option 4444444444");

		jrb[0].addItemListener(this);
		jrb[1].addItemListener(this);
		jrb[2].addItemListener(this);
		jrb[3].addItemListener(this);


		bg.add(jrb[0]);
		bg.add(jrb[1]);
		bg.add(jrb[2]);
		bg.add(jrb[3]);

		jrb[0].setBounds(0,0,150,20);
		jrb[1].setBounds(0,30,150,20);
		jrb[2].setBounds(0,60,150,20);
		jrb[3].setBounds(0,90,150,20);


		radioPanel.add(jrb[1]);
		radioPanel.add(jrb[0]);
		radioPanel.add(jrb[2]);
		radioPanel.add(jrb[3]);

		mcq_card_panel.add(radioPanel);

		//		bg.clearSelection();

		/*mcq_card_panel_picture_lb = new JLabel();
		mcq_card_panel_picture_lb.setIcon(new ImageIcon("img.jpg"));
		//		mcq_card_panel_picture_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		mcq_card_panel_picture_lb.setBounds(450,100,400,400);
		mcq_card_panel.add(mcq_card_panel_picture_lb);
		 */

		mcq_card_pic_upload_btn = new JButton("Picture");
		mcq_card_pic_upload_btn.setBounds(500, 160, 90, 30);
		mcq_card_pic_upload_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == mcq_card_pic_upload_btn){
					//					basic2.show(card_Layout_panel, "");
				}
			}
		});
		mcq_card_panel.add(mcq_card_pic_upload_btn);


		mcq_card_next_btn = new JButton("Next");
		mcq_card_next_btn.setBounds(400, 410, 90, 30);
		mcq_card_next_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == mcq_card_next_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		mcq_card_panel.add(mcq_card_next_btn);

		mcq_card_exit_btn = new JButton("Exit");
		mcq_card_exit_btn.setBounds(570, 410, 90, 30);
		mcq_card_exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == mcq_card_exit_btn){
					System.exit(0);
				}
			}
		});
		mcq_card_panel.add(mcq_card_exit_btn);

		mcq_card_previous_btn = new JButton("Previous");
		mcq_card_previous_btn.setBounds(10, 410, 90, 30);
		mcq_card_previous_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == mcq_card_previous_btn){
					System.exit(0);
				}
			}
		});
		mcq_card_panel.add(mcq_card_previous_btn);

		card_Layout_panel.add(mcq_card_panel,"mcq_card_panel");
		/////////////////////////////////////////////////////////////////////////////////





























		///////Instruction Card////////

		sorry_time_out_card_panel = new JPanel();
		sorry_time_out_card_panel.setLayout(null);
		sorry_time_out_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		sorry_time_out_card_panel.setBounds(0,200,670,460);

		sorry_time_out_subject_name_lb = new JLabel("Subject Name");
		sorry_time_out_subject_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		sorry_time_out_subject_name_lb.setBounds(300,20,150,50);
		sorry_time_out_card_panel.add(sorry_time_out_subject_name_lb);

		sorry_time_out_back_btn = new JButton("Back");
		sorry_time_out_back_btn.setBounds(10, 10, 70, 30);
		sorry_time_out_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == sorry_time_out_back_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		sorry_time_out_card_panel.add(sorry_time_out_back_btn);

		sorry_time_out_what_happens_lb = new JLabel(
				"<html> 1.   It is dummy what_happens.It is dummy what_happens.It is dummy what_happens.<br><br>"
						+ "2.   It is dummy what_happens.It is dummy what_happens.It is dummy what_happens.<br><br>"
						+ "3.   It is dummy what_happens.It is dummy what_happens.It is dummy what_happens.<br><br>"
						+ "3.   It is dummy what_happens.It is dummy what_happens.It is dummy what_happens.<br><br>"
						+ "4.  It is dummy what_happens.It is dummy what_happens.It is dummy what_happens.</html>");
		sorry_time_out_what_happens_lb.setBounds(100,30,600,400);
		sorry_time_out_card_panel.add(sorry_time_out_what_happens_lb);


		sorry_time_out_view_result_btn = new JButton("View Result");
		sorry_time_out_view_result_btn.setBounds(300, 410, 120, 30);
		sorry_time_out_view_result_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == sorry_time_out_view_result_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		sorry_time_out_card_panel.add(sorry_time_out_view_result_btn);


		sorry_time_out_exit_btn = new JButton("Exit");
		sorry_time_out_exit_btn.setBounds(590, 410, 70, 30);
		sorry_time_out_exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == sorry_time_out_exit_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		sorry_time_out_card_panel.add(sorry_time_out_exit_btn);


		card_Layout_panel.add(sorry_time_out_card_panel,"sorry_time_out_card_panel");

		/////////////////////////////////////////////////////////////////////////////////////////////////

		///////Forgot Password Card////////

		forgot_pass_card_panel = new JPanel();
		forgot_pass_card_panel.setLayout(null);
		forgot_pass_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		forgot_pass_card_panel.setBounds(0,200,670,460);


		forgot_pass_back_btn = new JButton("Back");
		forgot_pass_back_btn.setBounds(10, 10, 70, 30);
		forgot_pass_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == forgot_pass_back_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		forgot_pass_card_panel.add(forgot_pass_back_btn);

		forgot_pass_forgot_lb = new JLabel("Forgot Your Password");
		forgot_pass_forgot_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,20));
		forgot_pass_forgot_lb.setBounds(20,100,200,100);
		forgot_pass_card_panel.add(forgot_pass_forgot_lb);

		forgot_pass_enter_email_lb = new JLabel("Enter your Email here!");
		forgot_pass_enter_email_lb.setBounds(100,30,600,400);
		forgot_pass_card_panel.add(forgot_pass_enter_email_lb);

		forgot_pass_email_jtf = new JTextField();
		forgot_pass_email_jtf.setBounds(100,250,150,30);
		forgot_pass_card_panel.add(forgot_pass_email_jtf);




		forgot_pass_submit_btn = new JButton("Submit");
		forgot_pass_submit_btn.setBounds(100, 300, 80, 30);
		forgot_pass_submit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == forgot_pass_submit_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		forgot_pass_card_panel.add(forgot_pass_submit_btn);


		card_Layout_panel.add(forgot_pass_card_panel,"forgot_pass_card_panel");
		//////////////////////////////////////////////////////////////////////////////////////////

		///////Forgot Password Code Card////////

		forgot_pass_code_card_panel = new JPanel();
		forgot_pass_code_card_panel.setLayout(null);
		forgot_pass_code_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		forgot_pass_code_card_panel.setBounds(0,200,670,460);


		forgot_pass_code_back_btn = new JButton("Back");
		forgot_pass_code_back_btn.setBounds(10, 10, 70, 30);
		forgot_pass_code_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == forgot_pass_code_back_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		forgot_pass_code_card_panel.add(forgot_pass_code_back_btn);

		forgot_pass_code_forgot_lb = new JLabel("Forgot Your Password");
		forgot_pass_code_forgot_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,20));
		forgot_pass_code_forgot_lb.setBounds(20,100,200,100);
		forgot_pass_code_card_panel.add(forgot_pass_code_forgot_lb);

		forgot_pass_code_code_instructions_lb = new JLabel(
				"<html> 1.   It is dummy code Istructions.It is dummy what_happens.It is dummy what_happens.<br>"
						+ "2.   It is dummy what_happens.It is dummy what_happens.It is dummy what_happens.<br>"
						+ "3.   It is dummy what_happens.It is dummy what_happens.It is dummy what_happens.<br>"
						+ "3.   It is dummy what_happens.It is dummy what_happens.It is dummy what_happens.<br>"
						+ "4.  It is dummy what_happens.It is dummy what_happens.It is dummy what_happens.</html>");
		forgot_pass_code_code_instructions_lb.setBounds(100,30,600,400);
		forgot_pass_code_card_panel.add(forgot_pass_code_code_instructions_lb);

		forgot_pass_code_code_lb = new JLabel("Enter Code here!");
		forgot_pass_code_code_lb.setBounds(100,130,600,400);
		forgot_pass_code_card_panel.add(forgot_pass_code_code_lb);

		forgot_pass_code_jtf = new JTextField();
		forgot_pass_code_jtf.setBounds(100,350,150,30);
		forgot_pass_code_card_panel.add(forgot_pass_code_jtf);


		forgot_pass_code_submit_btn = new JButton("Submit");
		forgot_pass_code_submit_btn.setBounds(100, 400, 80, 30);
		forgot_pass_code_submit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == forgot_pass_code_submit_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		forgot_pass_code_card_panel.add(forgot_pass_code_submit_btn);


		card_Layout_panel.add(forgot_pass_code_card_panel,"forgot_pass_code_card_panel");
		////////////////////////////////////////////////////////////////////////////////////////////////////

		///////Reset Password Card////////

		reset_pass_card_panel = new JPanel();
		reset_pass_card_panel.setLayout(null);
		reset_pass_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		reset_pass_card_panel.setBounds(0,200,670,460);


		reset_pass_card_back_btn = new JButton("Back");
		reset_pass_card_back_btn.setBounds(10, 10, 70, 30);
		reset_pass_card_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == reset_pass_card_back_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		reset_pass_card_panel.add(reset_pass_card_back_btn);

		reset_pass_card_reset_pas_lb = new JLabel("Reset Your Password");
		reset_pass_card_reset_pas_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,20));
		reset_pass_card_reset_pas_lb.setBounds(20,100,200,100);
		reset_pass_card_panel.add(reset_pass_card_reset_pas_lb);


		reset_pass_card_enter_pas_lb = new JLabel("Enter your new Password here!");
		reset_pass_card_enter_pas_lb.setBounds(100,200,200,50);
		reset_pass_card_panel.add(reset_pass_card_enter_pas_lb);

		reset_pass_card_enter_pas_jtf= new JTextField();
		reset_pass_card_enter_pas_jtf.setBounds(100,250,150,30);
		reset_pass_card_panel.add(reset_pass_card_enter_pas_jtf);

		reset_pass_card_confirm_pas_lb = new JLabel("Type Again!");
		reset_pass_card_confirm_pas_lb.setBounds(100,280,200,50);
		reset_pass_card_panel.add(reset_pass_card_confirm_pas_lb);

		reset_pass_card_confirm_pas_jtf= new JTextField();
		reset_pass_card_confirm_pas_jtf.setBounds(100,330,150,30);
		reset_pass_card_panel.add(reset_pass_card_confirm_pas_jtf);


		reset_pass_card_submit_btn = new JButton("Submit");
		reset_pass_card_submit_btn.setBounds(100, 380, 80, 30);
		reset_pass_card_submit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == reset_pass_card_submit_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		reset_pass_card_panel.add(reset_pass_card_submit_btn);


		card_Layout_panel.add(reset_pass_card_panel,"reset_pass_card_panel");
		////////////////////////////////////////////////////////////////////////////////////////////////////					
	}

	public void teacher_view_gui(){
		///////////////Teacher view welcome card/////////////

		teacher_welcome_card_panel = new JPanel();
		teacher_welcome_card_panel.setLayout(null);
		teacher_welcome_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		teacher_welcome_card_panel.setBounds(0,200,670,460);

		teacher_welcome_card_welcome_lb = new JLabel("Welcome");
		teacher_welcome_card_welcome_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		teacher_welcome_card_welcome_lb.setBounds(300,20,150,50);
		teacher_welcome_card_panel.add(teacher_welcome_card_welcome_lb);


		teacher_welcome_card_create_paper_lb_btn = new JButton("Create Paper");
		teacher_welcome_card_create_paper_lb_btn.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		teacher_welcome_card_create_paper_lb_btn.setBounds(170,170,150,50);
		teacher_welcome_card_create_paper_lb_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				if (source == teacher_welcome_card_create_paper_lb_btn){
					basic2.show(card_Layout_panel, "create_paper_card_panel");
				}
			}
		});
		teacher_welcome_card_panel.add(teacher_welcome_card_create_paper_lb_btn);

		//////
		teacher_welcome_card_view_papers_lb_btn = new JButton("View Papers");
		teacher_welcome_card_view_papers_lb_btn.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		teacher_welcome_card_view_papers_lb_btn.setBounds(450,170,150,50);
		teacher_welcome_card_view_papers_lb_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				if (source == teacher_welcome_card_view_papers_lb_btn){
					
//					LinkedList<papers> lp= c.getCompletePaper();
					basic2.show(card_Layout_panel, "view_papers_card_panel");
				}
			}
		});
		teacher_welcome_card_panel.add(teacher_welcome_card_view_papers_lb_btn);

		teacher_welcome_card_view_results_lb_btn = new JButton("View Results");
		teacher_welcome_card_view_results_lb_btn.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		teacher_welcome_card_view_results_lb_btn.setBounds(170,300,150,50);
		teacher_welcome_card_view_results_lb_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				if (source == teacher_welcome_card_view_results_lb_btn){
//					c.getConductedPapers();
					basic2.show(card_Layout_panel, "view_papers_card_panel");
				}
			}
		});
		teacher_welcome_card_panel.add(teacher_welcome_card_view_results_lb_btn);


		teacher_welcome_card_drafts_lb_btn = new JButton("Drafts");
		teacher_welcome_card_drafts_lb_btn.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		teacher_welcome_card_drafts_lb_btn.setBounds(450,300,150,50);
		teacher_welcome_card_drafts_lb_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				if (source == teacher_welcome_card_drafts_lb_btn){
					//										basic2.show(card_Layout_panel, "");
				}
			}
		});
		teacher_welcome_card_panel.add(teacher_welcome_card_drafts_lb_btn);


		card_Layout_panel.add(teacher_welcome_card_panel,"teacher_welcome_card_panel");

		///////////////////////////////////////////////////////////

		//////Create Paper Card////
		create_paper_card_panel = new JPanel();
		create_paper_card_panel.setLayout(null);
		create_paper_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		create_paper_card_panel.setBounds(0,200,670,460);

		create_paper_card_back_btn = new JButton("Back");
		create_paper_card_back_btn.setBounds(10, 10, 70, 30);
		create_paper_card_panel.add(create_paper_card_back_btn);
		create_paper_card_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				if (source == create_paper_card_back_btn){
					basic2.show(card_Layout_panel, "teacher_welcome_card_panel");
				}
			}
		});


		create_paper_create_lb = new JLabel("Create Paper");
		create_paper_create_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		create_paper_create_lb.setBounds(250,20,150,50);
		create_paper_card_panel.add(create_paper_create_lb);

		create_paper_select_subject_lb = new JLabel("Select Subject");
		create_paper_select_subject_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		create_paper_select_subject_lb.setBounds(30,80,150,50);
		create_paper_card_panel.add(create_paper_select_subject_lb);


		graded_chk_box = new JCheckBox("Graded Paper. Select from slider");
		graded_chk_box.setBounds(30,170,220,50);
		graded_chk_box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox source =(JCheckBox) e.getSource();
				if (source.isSelected()){
					//					System.out.println("Selected");
				}
			}
		});
		create_paper_card_panel.add(graded_chk_box);


		grade_num_panel = new JPanel();
		String[] grade_num_choices = { "5","10","15","20","25","30","40","45","50"};
		final JComboBox<String> grade_num_1 = new JComboBox<String>(grade_num_choices);
		grade_num_panel.add(grade_num_1);
		grade_num_panel.setBounds(200, 180, 150, 40);
		create_paper_card_panel.add(grade_num_panel);
		/*
		JPanel panel=new JPanel();  
		JSlider grade_slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
		grade_slider.setMinorTickSpacing(5);  
		grade_slider.setMajorTickSpacing(5);  

		grade_slider.setPaintTicks(true);  
		grade_slider.setPaintLabels(true);  

		panel.add(grade_slider);  
		panel.setBounds(400,180,200,100);
		create_paper_card_panel.add(panel); */ 

		create_paper_paper_no_of_questions_lb = new JLabel("No of Questions/Paper");
		//		create_paper_paper_no_of_questions_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		create_paper_paper_no_of_questions_lb.setBounds(50,210,220,50);
		create_paper_card_panel.add(create_paper_paper_no_of_questions_lb);

		no_of_question_per_paper_panel = new JPanel();
		String[] no_of_question_per_paper_num_choices = { "5","10","15","20","25","30","40","45","50"};
		final JComboBox<String> grade_num_obj = new JComboBox<String>(no_of_question_per_paper_num_choices);
		no_of_question_per_paper_panel.add(grade_num_obj);
		no_of_question_per_paper_panel.setBounds(200, 220, 150, 40);
		create_paper_card_panel.add(no_of_question_per_paper_panel);


		create_paper_paper_marks_per_question_lb = new JLabel("Marks/Question");
		//		create_paper_paper_no_of_questions_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		create_paper_paper_marks_per_question_lb.setBounds(50,250,220,50);
		create_paper_card_panel.add(create_paper_paper_marks_per_question_lb);

		marks_per_question_panel = new JPanel();
		String[] marks_per_question_choices = { "5","10","15","20","25","30","40","45","50"};
		final JComboBox<String> marks_per_question_obj = new JComboBox<String>(marks_per_question_choices);
		marks_per_question_panel.add(marks_per_question_obj);
		marks_per_question_panel.setBounds(200, 260, 150, 40);
		create_paper_card_panel.add(marks_per_question_panel);




		negative_marking_box = new JCheckBox("Negative Marking");
		negative_marking_box.setBounds(30,290,220,50);
		negative_marking_box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JCheckBox source =(JCheckBox) awais.getSource();
				if (source.isSelected()){
					System.out.println("Selected");
				}
			}
		});
		create_paper_card_panel.add(negative_marking_box);


		negative_marking_panel = new JPanel();
		String[] negative_marking_choices = { "5","10","15","20","25","30","40","45","50"};
		final JComboBox<String> negative_marking__obj = new JComboBox<String>(grade_num_choices);
		negative_marking_panel.add(negative_marking__obj);
		negative_marking_panel.setBounds(200, 300, 150, 40);
		create_paper_card_panel.add(negative_marking_panel);

		create_paper_paper_duration_lb = new JLabel("Paper Duration(Hours)");
		//		create_paper_paper_no_of_marks_per_questions_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		create_paper_paper_duration_lb.setBounds(50,330,220,50);
		create_paper_card_panel.add(create_paper_paper_duration_lb);


		paper_duration_panel = new JPanel();
		String[] paper_duration_choices = { ".5","1","1.5","2","2.5","3"};
		final JComboBox<String> paper_duration_obj = new JComboBox<String>(paper_duration_choices);
		paper_duration_panel.add(paper_duration_obj);
		paper_duration_panel.setBounds(200, 340, 150, 40);
		create_paper_card_panel.add(paper_duration_panel);



		create_paper_select_paper_name_lb = new JLabel("Paper Name");
		create_paper_select_paper_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		create_paper_select_paper_name_lb.setBounds(400,80,150,50);
		create_paper_card_panel.add(create_paper_select_paper_name_lb);



		JTextField create_paper_card_panel_paper_nm_jtf = new JTextField();
		create_paper_card_panel_paper_nm_jtf.setBounds(400,120,250,30);

		create_paper_card_panel.add(create_paper_card_panel_paper_nm_jtf);

		create_paper_paper_paper_date_lb = new JLabel("Paper Date");
		create_paper_paper_paper_date_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		create_paper_paper_paper_date_lb.setBounds(400,160,220,30);
		create_paper_card_panel.add(create_paper_paper_paper_date_lb);


		JPanel date_panel = new JPanel();
		date_panel.setBounds(400, 200, 220, 50);
		UtilDateModel model = new UtilDateModel();
		model.setDate(2016, 3, 1);

		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);

		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel,new DateLabelFormatter());
		date_panel.add(datePicker);
		create_paper_card_panel.add(date_panel);

		// To Get the date ////////////////////////
		//		Date selectedDate = (Date) datePicker.getModel().getValue();

		JLabel create_paper_select_paper_duaration_lb;

		create_paper_select_paper_duaration_lb = new JLabel("Paper Duration (Mins)");
		//		create_paper_select_paper_duaration_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		create_paper_select_paper_duaration_lb.setBounds(400,250,200,50);
		create_paper_card_panel.add(create_paper_select_paper_duaration_lb);

		JPanel create_paper_paper_time_panel;
		create_paper_paper_time_panel = new JPanel();
		String[] create_paper_paper_time_choices = { "30","60","90","120","160","150","180"};
		final JComboBox<String> paper_time_obj = new JComboBox<String>(create_paper_paper_time_choices);
		create_paper_paper_time_panel.add(paper_time_obj);
		create_paper_paper_time_panel.setBounds(530,260,50,40);
		create_paper_card_panel.add(create_paper_paper_time_panel);
		////////////////////////////////////////////////////////

		JPanel jbox = new JPanel();
		String[] choices = { "CHOICE 1111","CHOICE 22222", "CHOICE 33333","CHOICE 4","CHOICE 5","CHOICE 6"};

		final JComboBox<String> cb = new JComboBox<String>(choices);
		cb.setVisible(true);
		jbox.add(cb);
		jbox.setBounds(10, 120, 150, 50);
		create_paper_card_panel.add(jbox);




		create_paper_card_submit_btn = new JButton("Next");
		create_paper_card_submit_btn.setBounds(270, 400, 80, 30);
		create_paper_card_submit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == create_paper_card_submit_btn){
					basic2.show(card_Layout_panel, "create_paper_by_teacher_card_panel");
				}
			}
		});
		create_paper_card_panel.add(create_paper_card_submit_btn);



		card_Layout_panel.add(create_paper_card_panel,"create_paper_card_panel");

		///////////////////////////////////////////////////

		//////////   Set Instructions Card for teacher////////

		set_instructions_by_teacher_card_panel = new JPanel();
		set_instructions_by_teacher_card_panel.setLayout(null);
		set_instructions_by_teacher_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		set_instructions_by_teacher_card_panel.setBounds(0,200,670,460);

		set_instructions_by_teacher_card_back_btn = new JButton("Back");
		set_instructions_by_teacher_card_back_btn.setBounds(10, 10, 70, 30);
		set_instructions_by_teacher_card_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == set_instructions_by_teacher_card_back_btn){
					basic2.show(card_Layout_panel, "create_paper_by_teacher_card_panel");
				}
			}
		});
		set_instructions_by_teacher_card_panel.add(set_instructions_by_teacher_card_back_btn);

		set_instructions_by_teacher_create_paper_lb = new JLabel("Create Paper");
		set_instructions_by_teacher_create_paper_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		set_instructions_by_teacher_create_paper_lb.setBounds(300,20,150,50);
		set_instructions_by_teacher_card_panel.add(set_instructions_by_teacher_create_paper_lb);


		set_instructions_by_teacher_set_instructions_lb = new JLabel("Set Instructions");
		set_instructions_by_teacher_set_instructions_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		set_instructions_by_teacher_set_instructions_lb.setBounds(30,80,150,50);
		set_instructions_by_teacher_card_panel.add(set_instructions_by_teacher_set_instructions_lb);

		set_instructions_by_teacher_set_instructions_jta = new JTextArea();
		//		set_instructions_by_teacher_set_instructions_jtf.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		set_instructions_by_teacher_set_instructions_jta.setBounds(30,130,400,200);
		set_instructions_by_teacher_card_panel.add(set_instructions_by_teacher_set_instructions_jta);


		set_instructions_by_teacher_submit_btn = new JButton("Next");
		set_instructions_by_teacher_submit_btn.setBounds(270, 400, 80, 30);
		set_instructions_by_teacher_submit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == set_instructions_by_teacher_submit_btn){
					//					basic2.show(card_Layout_panel, "create_paper_by_teacher_card_panel");
				}
			}
		});
		set_instructions_by_teacher_card_panel.add(set_instructions_by_teacher_submit_btn);

		card_Layout_panel.add(set_instructions_by_teacher_card_panel,"set_instructions_by_teacher_card_panel");



		////////Create Paper Card///////////


		create_paper_by_teacher_card_panel = new JPanel();
		create_paper_by_teacher_card_panel.setLayout(null);
		create_paper_by_teacher_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		create_paper_by_teacher_card_panel.setBounds(0,200,670,460);

		create_paper_by_teacher_card_back_btn = new JButton("Back");
		create_paper_by_teacher_card_back_btn.setBounds(10, 10, 70, 30);
		create_paper_by_teacher_card_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == create_paper_by_teacher_card_back_btn){
					basic2.show(card_Layout_panel, "create_paper_card_panel");
				}
			}
		});
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_card_back_btn);


		create_paper_by_teacher_card_name_lb = new JLabel("Subject Name");
		create_paper_by_teacher_card_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		create_paper_by_teacher_card_name_lb.setBounds(240,20,150,50);
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_card_name_lb);

		create_paper_by_teacher_card_examination_lb = new JLabel("Examination");
		create_paper_by_teacher_card_examination_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,20));
		create_paper_by_teacher_card_examination_lb.setBounds(250,50,150,50);
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_card_examination_lb);

		create_paper_by_teacher_card_current_question_lb = new JLabel("C");
		//		mcq_card_panel_current_question_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		create_paper_by_teacher_card_current_question_lb.setBounds(30,130,20,20);
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_card_current_question_lb);


		create_paper_by_teacher_card_total_question_lb = new JLabel("/ " + "T" );
		//		mcq_card_panel_total_question_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		create_paper_by_teacher_card_total_question_lb.setBounds(50,130,20,20);
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_card_total_question_lb);

		create_paper_by_teacher_card_question_lb = new JLabel("Question :");
		create_paper_by_teacher_card_question_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,15));
		create_paper_by_teacher_card_question_lb.setBounds(80,130,400,20);
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_card_question_lb);


		create_paper_by_teacher_card_question_content_jtf = new JTextField();
		//		create_paper_by_teacher_card_question_content_jtf.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		create_paper_by_teacher_card_question_content_jtf.setBounds(20,160,630,30);
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_card_question_content_jtf);

		JPanel mcq_radio = new JPanel();
		mcq_radio.setLayout(null);
		//		mcq_radio.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2));
		mcq_radio.setBounds(10,200,50,180);


		for(int i=0; i<jrb_create_paper_by_teacher.length ; i++){
			jrb_create_paper_by_teacher[i]=new JRadioButton();
			jrb_create_paper_by_teacher[i].addItemListener(this);
			//			create_paper_by_teacher_bg.add(jrb_create_paper_by_teacher[i]);
			mcq_radio.add(jrb_create_paper_by_teacher[i]);
		}


		jrb_create_paper_by_teacher[0].setBounds(10,25,20,20);
		jrb_create_paper_by_teacher[1].setBounds(10,65,20,20);
		jrb_create_paper_by_teacher[2].setBounds(10,105,20,20);
		jrb_create_paper_by_teacher[3].setBounds(10,145,20,20);


		create_paper_by_teacher_card_panel.add(mcq_radio);


		create_paper_by_teacher_opt1_jtf = new JTextField();
		create_paper_by_teacher_opt1_jtf.setBounds(60,220,200,30);
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_opt1_jtf);

		create_paper_by_teacher_opt2_jtf = new JTextField();
		create_paper_by_teacher_opt2_jtf.setBounds(60,260,200,30);
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_opt2_jtf);

		create_paper_by_teacher_opt3_jtf = new JTextField();
		create_paper_by_teacher_opt3_jtf.setBounds(60,300,200,30);
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_opt3_jtf);

		create_paper_by_teacher_opt4_jtf = new JTextField();
		create_paper_by_teacher_opt4_jtf.setBounds(60,340,200,30);
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_opt4_jtf);


		create_paper_by_teacher_pic_upload_btn = new JButton("Upload");
		create_paper_by_teacher_pic_upload_btn.setBounds(500, 250, 90, 30);
		create_paper_by_teacher_pic_upload_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == create_paper_by_teacher_pic_upload_btn){
					//					basic2.show(card_Layout_panel, "");
				}
			}
		});
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_pic_upload_btn);

		create_paper_by_teacher_pic_preview_btn = new JButton("Preview");
		create_paper_by_teacher_pic_preview_btn.setBounds(500, 300, 90, 30);
		create_paper_by_teacher_pic_preview_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == create_paper_by_teacher_pic_preview_btn){
					picture_pop_up obj = new picture_pop_up();					
				}
			}
		});
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_pic_preview_btn);


		create_paper_by_teacher_next_btn = new JButton("Add another question");
		create_paper_by_teacher_next_btn.setBounds(380, 410, 170, 30);
		create_paper_by_teacher_next_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == create_paper_by_teacher_next_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_next_btn);


		create_paper_by_teacher_exit_btn = new JButton("Exit");
		create_paper_by_teacher_exit_btn.setBounds(570, 410, 90, 30);
		create_paper_by_teacher_exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == create_paper_by_teacher_exit_btn){
					System.exit(0);
				}
			}
		});
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_exit_btn);


		create_paper_by_teacher_previous_btn = new JButton("Previous");
		create_paper_by_teacher_previous_btn.setBounds(10, 410, 90, 30);
		create_paper_by_teacher_previous_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == create_paper_by_teacher_previous_btn){
					//					System.exit(0);
				}
			}
		});
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_previous_btn);


		create_paper_by_teacher_save_btn = new JButton("Save and Exit");
		create_paper_by_teacher_save_btn.setBounds(10, 410, 90, 30);
		create_paper_by_teacher_save_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == create_paper_by_teacher_save_btn){
					System.exit(0);
				}
			}
		});
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_save_btn);

		create_paper_by_teacher_compeleted_btn = new JButton("Completed");
		create_paper_by_teacher_compeleted_btn.setBounds(130, 410, 110, 30);
		create_paper_by_teacher_compeleted_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == create_paper_by_teacher_compeleted_btn){
					basic2.show(card_Layout_panel, "set_instructions_by_teacher_card_panel");
				}
			}
		});
		create_paper_by_teacher_card_panel.add(create_paper_by_teacher_compeleted_btn);


		card_Layout_panel.add(create_paper_by_teacher_card_panel,"create_paper_by_teacher_card_panel");
		/////////////////////////////////////////////////////////////////////////////////



		//////////  Paper Code View ////////
		JPanel paper_code_by_teacher_panel;
		paper_code_by_teacher_panel = new JPanel();
		paper_code_by_teacher_panel.setLayout(null);
		paper_code_by_teacher_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		paper_code_by_teacher_panel.setBounds(0,200,670,460);

		JButton paper_code_by_teacher_panel_back_btn;
		paper_code_by_teacher_panel_back_btn = new JButton("Back");
		paper_code_by_teacher_panel_back_btn.setBounds(10, 10, 70, 30);
		paper_code_by_teacher_panel_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == paper_code_by_teacher_panel_back_btn){
					//					basic2.show(card_Layout_panel, "");
				}
			}
		});
		paper_code_by_teacher_panel.add(paper_code_by_teacher_panel_back_btn);

		JLabel paper_code_by_teacher_create_paper_lb;
		paper_code_by_teacher_create_paper_lb = new JLabel("Create Paper");
		paper_code_by_teacher_create_paper_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		paper_code_by_teacher_create_paper_lb.setBounds(300,20,150,50);
		paper_code_by_teacher_panel.add(paper_code_by_teacher_create_paper_lb);

		JLabel paper_code_by_teacher_paper_code_lb;
		paper_code_by_teacher_paper_code_lb = new JLabel("Paper Code");
		paper_code_by_teacher_paper_code_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		paper_code_by_teacher_paper_code_lb.setBounds(300,200,150,50);
		paper_code_by_teacher_panel.add(paper_code_by_teacher_paper_code_lb);

		JLabel paper_code_by_teacher_paper_code2_lb;
		paper_code_by_teacher_paper_code2_lb = new JLabel("e.g rt56y6 (Paper Code)");
		paper_code_by_teacher_paper_code2_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		paper_code_by_teacher_paper_code2_lb.setBounds(270,230,200,50);
		paper_code_by_teacher_panel.add(paper_code_by_teacher_paper_code2_lb);

		JLabel paper_code_by_teacher_paper_remember_code_lb;
		paper_code_by_teacher_paper_remember_code_lb = new JLabel("* Remember this code");
		paper_code_by_teacher_paper_remember_code_lb.setFont(new Font("Times new Roman", Font.ITALIC,15));
		paper_code_by_teacher_paper_remember_code_lb.setBounds(270,260,200,50);
		paper_code_by_teacher_panel.add(paper_code_by_teacher_paper_remember_code_lb);

		JButton spaper_code_by_teacher_submit_btn;
		spaper_code_by_teacher_submit_btn = new JButton("Next");
		spaper_code_by_teacher_submit_btn.setBounds(270, 400, 80, 30);
		spaper_code_by_teacher_submit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == spaper_code_by_teacher_submit_btn){
					//					basic2.show(card_Layout_panel, "");
				}
			}
		});
		paper_code_by_teacher_panel.add(spaper_code_by_teacher_submit_btn);

		card_Layout_panel.add(paper_code_by_teacher_panel,"paper_code_by_teacher_panel");
		////////////////////////////////////////////////////////////////////////////

		/////////Edit Paper Details Card//////
		JPanel edit_paper_details_card_panel;
		edit_paper_details_card_panel = new JPanel();
		edit_paper_details_card_panel.setLayout(null);
		edit_paper_details_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		edit_paper_details_card_panel.setBounds(0,200,670,460);

		JLabel edit_paper_details_card_instruction_lb;
		edit_paper_details_card_instruction_lb = new JLabel("Edit Paper Details");
		edit_paper_details_card_instruction_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		edit_paper_details_card_instruction_lb.setBounds(250,20,200,50);
		edit_paper_details_card_panel.add(edit_paper_details_card_instruction_lb);

		JButton edit_paper_details_card_back_btn;

		edit_paper_details_card_back_btn = new JButton("Back");
		edit_paper_details_card_back_btn.setBounds(10, 10, 70, 30);
		edit_paper_details_card_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == edit_paper_details_card_back_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		edit_paper_details_card_panel.add(edit_paper_details_card_back_btn);

		JLabel edit_paper_details_edit_instruction_lb;
		edit_paper_details_edit_instruction_lb = new JLabel("Edit Instructions");
		edit_paper_details_edit_instruction_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		edit_paper_details_edit_instruction_lb.setBounds(50,120,130,50);
		edit_paper_details_card_panel.add(edit_paper_details_edit_instruction_lb);


		JTextArea edit_paper_details_instructions_jta;

		edit_paper_details_instructions_jta = new JTextArea();
		edit_paper_details_instructions_jta.setBounds(50,180,500,200);
		edit_paper_details_card_panel.add(edit_paper_details_instructions_jta);

		JButton edit_paper_details_card_save_btn;

		edit_paper_details_card_save_btn = new JButton("Save Changes");
		edit_paper_details_card_save_btn.setBounds(220, 410, 120, 30);
		edit_paper_details_card_save_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == edit_paper_details_card_save_btn){
					basic2.show(card_Layout_panel, "");
				}
			}
		});
		edit_paper_details_card_panel.add(edit_paper_details_card_save_btn);




		card_Layout_panel.add(edit_paper_details_card_panel,"edit_paper_details_card_panel");
		//////////////////////////////////////////////////////////////////////

		////// View papers Card////////


		view_papers_card_panel = new JPanel();
		view_papers_card_panel.setLayout(null);
		view_papers_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		view_papers_card_panel.setBounds(0,200,670,460);

		view_papers_card_subject_name_lb = new JLabel("View Papers");
		view_papers_card_subject_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		view_papers_card_subject_name_lb.setBounds(300,20,150,50);
		view_papers_card_panel.add(view_papers_card_subject_name_lb);


		view_papers_card_back_btn = new JButton("Back");
		view_papers_card_back_btn.setBounds(10, 10, 70, 30);
		view_papers_card_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == view_papers_card_back_btn){
					basic2.show(card_Layout_panel, "teacher_welcome_card_panel");
				}
			}
		});
		view_papers_card_panel.add(view_papers_card_back_btn);



		view_papers_card_paper1_lb = new JLabel("Paper 1");
		//		view_papers_card_paper1_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_papers_card_paper1_lb.setBounds(100,200,50,30);
		view_papers_card_panel.add(view_papers_card_paper1_lb);

		JPanel jbox_paper1 = new JPanel();
		String[] choices1 = { "--Select--","Edit","Delete"};
		final JComboBox<String> obj1 = new JComboBox<String>(choices1);
		obj1.setVisible(true);
		obj1.setSelectedItem("--Select--");
		jbox_paper1.add(obj1);
		jbox_paper1.setBounds(90,230,90,30);
		view_papers_card_panel.add(jbox_paper1);

		view_papers_card_paper2_lb = new JLabel("Paper 2");
		//		view_papers_card_paper2_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_papers_card_paper2_lb.setBounds(300,200,50,30);
		view_papers_card_panel.add(view_papers_card_paper2_lb);

		JPanel jbox_paper2 = new JPanel();
		String[] choices2 = { "--Select--","Edit","Delete"};
		final JComboBox<String> obj2 = new JComboBox<String>(choices1);
		obj2.setVisible(true);
		obj2.setSelectedItem("--Select--");
		jbox_paper2.add(obj2);
		jbox_paper2.setBounds(290,230,90,30);
		view_papers_card_panel.add(jbox_paper2);

		view_papers_card_paper3_lb = new JLabel("Paper 3");
		//		view_papers_card_paper3_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_papers_card_paper3_lb.setBounds(500,200,50,30);
		view_papers_card_panel.add(view_papers_card_paper3_lb);

		JPanel jbox_paper3 = new JPanel();
		String[] choices3 = { "--Select--","Edit","Delete"};
		final JComboBox<String> obj3 = new JComboBox<String>(choices1);
		obj3.setVisible(true);
		obj3.setSelectedItem("--Select--");
		jbox_paper3.add(obj3);
		jbox_paper3.setBounds(490,230,90,30);
		view_papers_card_panel.add(jbox_paper3);

		view_papers_card_paper4_lb = new JLabel(" Paper 4");
		//		view_papers_card_paper4_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_papers_card_paper4_lb.setBounds(100,300,50,30);
		view_papers_card_panel.add(view_papers_card_paper4_lb);

		JPanel jbox_paper4 = new JPanel();
		String[] choices4 = { "--Select--","Edit","Delete"};
		final JComboBox<String> obj4 = new JComboBox<String>(choices1);
		obj4.setVisible(true);
		obj4.setSelectedItem("--Select--");
		jbox_paper4.add(obj4);
		jbox_paper4.setBounds(90,330,90,30);
		view_papers_card_panel.add(jbox_paper4);


		view_papers_card_paper5_lb = new JLabel(" Paper 5");
		//		view_papers_card_paper5_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_papers_card_paper5_lb.setBounds(300,300,50,30);
		view_papers_card_panel.add(view_papers_card_paper5_lb);

		JPanel jbox_paper5 = new JPanel();
		String[] choices5 = { "--Select--","Edit","Delete"};
		final JComboBox<String> obj5 = new JComboBox<String>(choices1);
		obj5.setVisible(true);
		obj5.setSelectedItem("--Select--");
		jbox_paper5.add(obj5);
		jbox_paper5.setBounds(290,330,90,30);
		view_papers_card_panel.add(jbox_paper5);


		view_papers_card_paper6_lb = new JLabel(" Paper 6");
		//		view_papers_card_paper6_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_papers_card_paper6_lb.setBounds(500,300,50,30);
		view_papers_card_panel.add(view_papers_card_paper6_lb);

		JPanel jbox_paper6 = new JPanel();
		String[] choices6 = { "--Select--","Edit","Delete"};
		final JComboBox<String> obj6 = new JComboBox<String>(choices1);
		obj6.setVisible(true);
		obj6.setSelectedItem("--Select--");
		jbox_paper6.add(obj6);
		jbox_paper6.setBounds(490,330,90,30);
		view_papers_card_panel.add(jbox_paper6);

		card_Layout_panel.add(view_papers_card_panel,"view_papers_card_panel");

		///////////////////////////////////////////////////////////


		////// View papers Card////////

		JPanel view_result_card_panel;
		JLabel view_result_card_subject_name_lb,
		view_result_card_paper1_lb,
		view_result_card_paper2_lb,
		view_result_card_paper3_lb,
		view_result_card_paper4_lb,
		view_result_card_paper5_lb,
		view_result_card_paper6_lb;

		JButton view_result_card_back_btn;

		view_result_card_panel = new JPanel();
		view_result_card_panel.setLayout(null);
		view_result_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		view_result_card_panel.setBounds(0,200,670,460);

		view_result_card_subject_name_lb = new JLabel("View Papers");
		view_result_card_subject_name_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		view_result_card_subject_name_lb.setBounds(300,20,150,50);
		view_result_card_panel.add(view_result_card_subject_name_lb);

		view_result_card_back_btn = new JButton("Back");
		view_result_card_back_btn.setBounds(10, 10, 70, 30);
		view_result_card_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == view_result_card_back_btn){
					//					basic2.show(card_Layout_panel, "");
				}
			}
		});
		view_result_card_panel.add(view_result_card_back_btn);

		JPanel jbox_class = new JPanel();
		String[] jbox_class_choices = { "--Class--","2016","2017", "2018", "2019", "2020", "2021"};
		final JComboBox<String> jbox_class_obj = new JComboBox<String>(jbox_class_choices);
		jbox_class_obj.setVisible(true);
		jbox_class_obj.setSelectedItem("--Class--");
		jbox_class.add(jbox_class_obj);
		jbox_class.setBounds(20,60,90,30);
		view_result_card_panel.add(jbox_class);

		JPanel jbox_subject = new JPanel();
		String[] jbox_subject_choices = { "--Subject--","CASS","CCN", "DSA", "DB"};
		final JComboBox<String> jbox_subject_obj = new JComboBox<String>(jbox_subject_choices);
		jbox_subject_obj.setVisible(true);
		jbox_subject_obj.setSelectedItem("--Subject--");
		jbox_subject.add(jbox_subject_obj);
		jbox_subject.setBounds(20,100,90,30);
		view_result_card_panel.add(jbox_subject);

		view_result_card_paper1_lb = new JLabel("Paper 1");
		//		view_papers_card_paper1_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_paper1_lb.setBounds(100,200,50,30);
		view_result_card_panel.add(view_result_card_paper1_lb);

		view_result_card_paper2_lb = new JLabel("Paper 2");
		//		view_result_card_paper2_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_paper2_lb.setBounds(300,200,50,30);
		view_result_card_panel.add(view_result_card_paper2_lb);

		view_result_card_paper3_lb = new JLabel("Paper 3");
		//		view_papers_card_paper3_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_paper3_lb.setBounds(500,200,50,30);
		view_result_card_panel.add(view_result_card_paper3_lb);

		view_result_card_paper4_lb = new JLabel(" Paper 4");
		//		view_papers_card_paper4_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_paper4_lb.setBounds(100,300,50,30);
		view_result_card_panel.add(view_result_card_paper4_lb);

		view_result_card_paper5_lb = new JLabel(" Paper 5");
		//		view_papers_card_paper5_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_paper5_lb.setBounds(300,300,50,30);
		view_result_card_panel.add(view_result_card_paper5_lb);

		view_result_card_paper5_lb = new JLabel(" Paper 6");
		//		view_papers_card_paper6_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_paper5_lb.setBounds(500,300,50,30);
		view_result_card_panel.add(view_result_card_paper5_lb);

		card_Layout_panel.add(view_result_card_panel,"view_result_card_panel");

		///////////////////////////////////////////////////////////
		////// View rerult second Card////////

		JPanel view_result2_card_panel;
		JLabel view_result_card_view_result_lb,
		view_result_card_whole_class_lb,
		view_result_card_Individual_lb,
		view_result_card_subj_name_lb,
		view_result_card_dept_name_lb,
		view_result_card_class_lb;

		JButton view_result2_card_back_btn;

		view_result_card_panel = new JPanel();
		view_result_card_panel.setLayout(null);
		view_result_card_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		view_result_card_panel.setBounds(0,200,670,460);

		view_result_card_view_result_lb = new JLabel("View Result");
		view_result_card_view_result_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,25));
		view_result_card_view_result_lb.setBounds(300,20,150,50);
		view_result_card_panel.add(view_result_card_view_result_lb);

		view_result2_card_back_btn = new JButton("Back");
		view_result2_card_back_btn.setBounds(10, 10, 70, 30);
		view_result2_card_back_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent awais) {
				JButton source = (JButton) awais.getSource();
				if (source == view_result2_card_back_btn){
					//					basic2.show(card_Layout_panel, "");
				}
			}
		});
		view_result_card_panel.add(view_result_card_back_btn);


		view_result_card_subj_name_lb = new JLabel("Subject Name");
		//		view_papers_card_paper1_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_subj_name_lb.setBounds(20,50,100,30);
		view_result_card_panel.add(view_result_card_subj_name_lb);

		view_result_card_class_lb = new JLabel("Class");
		//		view_papers_card_paper1_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_class_lb.setBounds(20, 70,70,30);
		view_result_card_panel.add(view_result_card_class_lb);

		view_result_card_dept_name_lb = new JLabel("Dept Name");
		//		view_papers_card_paper1_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_dept_name_lb.setBounds(20,90,70,30);
		view_result_card_panel.add(view_result_card_dept_name_lb);

		view_result_card_Individual_lb = new JLabel("Result of Individual Student");
		//		view_result_card_Individual_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_Individual_lb.setBounds(100,200,200,30);
		view_result_card_panel.add(view_result_card_Individual_lb);

		view_result_card_whole_class_lb = new JLabel("Result of whole Class");
		//		view_result_card_whole_class_lb.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC,17));
		view_result_card_whole_class_lb.setBounds(350,200,150,30);
		view_result_card_panel.add(view_result_card_whole_class_lb);

		card_Layout_panel.add(view_result_card_panel,"view_result_card_panel");

		///////////////////////////////////////////////////////////




	}


	public void standard_gui(){
		setSize(700,700);
		setTitle("System");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public class DateLabelFormatter extends AbstractFormatter {

		private String datePattern = "yyyy-MM-dd";
		private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

		@Override
		public Object stringToValue(String text) throws ParseException {
			return dateFormatter.parseObject(text);
		}

		@Override
		public String valueToString(Object value) throws ParseException {
			if (value != null) {
				Calendar cal = (Calendar) value;
				return dateFormatter.format(cal.getTime());
			}

			return "";
		}

	}




	@Override
	public void itemStateChanged(ItemEvent arg0) {
		if(jrb[0].isSelected()){

		}		
		if(jrb[1].isSelected()){

		}	
		if(jrb[2].isSelected()){

		}	
		if(jrb[3].isSelected()){

		}	
	}
}