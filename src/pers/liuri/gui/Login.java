package pers.liuri.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Login extends Frame {

	// 用户名和密码框
	TextField text_user, text_pass;

	public Login() {
		// 设置主题
		this.setTitle("Please Login");
		// 设置布局方式
		this.setLayout(null);
		// 设置大小
		this.setSize(260, 170);
		setResizable(false);
		Label userlb = new Label("UserName:");
		Label passlb = new Label("PassWord:");
		Button sure = new Button("Login");
		Button cancel = new Button("Cancel");
		text_user = new TextField();
		text_pass = new TextField();
		text_pass.setEchoChar('●');
		// 设置位置和大小
		userlb.setBounds(30, 53, 70, 20);
		passlb.setBounds(30, 83, 70, 20);
		text_user.setBounds(110, 50, 120, 20);
		text_pass.setBounds(110, 80, 120, 20);
		sure.setBounds(42, 120, 80, 25);
		cancel.setBounds(135, 120, 80, 25);
		this.add(text_user);
		this.add(text_pass);
		this.add(sure);
		this.add(cancel);

		// 添加确认按钮监听事件
		sure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sureActionListener(e);

			}
		});

		// 添加取消按钮监听事件
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// DbOp.close();
				dispose();

			}
		});
	}

	// 确认按钮监听函数
	protected void sureActionListener(ActionEvent e) {
		// TODO Auto-generated method stub
		String user = text_user.getText();
		String pass = text_pass.getText();
		String is_admin = "";
		if (user.equals("") || pass.equals("")) {
			JOptionPane.showMessageDialog(null, "密码不能为空，请输入密码");
			return;
		}
		/*
		 * try { String
		 * sql="select * from user where username="+"'"+user+"'"+"and password="+"'"+
		 * pass+"'"; ResultSet rs=DbOp.executeQuery(sql); if(rs.next()){
		 * is_admin=rs.getString("is_admin"); }else{
		 * JOptionPane.showMessageDialog(null,"Wrong that is UserNmae or Password ");
		 * return; } GlobalVar.login_user=user; ShowMain show=new ShowMain();
		 * show.setRights(is_admin);
		 * 
		 * System.out.println("Successed"); dispose(); }catch(
		 * 
		 * SQLException e) { JOptionPane.showMessageDialog(null,
		 * "the wrong from information"); }
		 */
	}
}
