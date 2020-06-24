package com.wb.architect.week03.n02;

import com.wb.architect.week03.n02.components.*;

public class Demo {
    public static void main(String[] args) {
        Container window = new WinForm("WINDOW窗口");
        window.add(new Picutre("LOGO图片"));
        window.add(new Button("登录"));
        window.add(new Button("注册"));

        Container frame1 = new Frame("FRAME1");
        window.add(frame1);

        frame1.add(new Label("用户名"));
        frame1.add(new TextBox("文本框"));
        frame1.add(new Label("密码"));
        frame1.add(new PasswordBox("密码框"));
        frame1.add(new CheckBox("复选框"));
        frame1.add(new TextBox("记住用户名"));
        frame1.add(new LinkLabel("忘记密码"));

        window.print();

    }
}
