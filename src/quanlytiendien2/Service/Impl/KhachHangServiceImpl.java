package quanlytiendien2.Service.Impl;


import quanlytiendien2.Service.ServiceKhachHang;
import quanlytiendien2.model.KhachHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhachHangServiceImpl implements ServiceKhachHang {
    List<String[]> list = ArrayList<>();
    List<KhachHang> khachHangList = new ArrayList<>();
    Scanner input =new Scanner(System.in);

    public static final String REGEX_KHVN = "(KHVN)[-]\\d{5}";
    private static final String REGEX_KHNN ="(KHNN)[-]\\d{5}";
    @Override
    public void display() {

    }


    @Override
    public void add() {

    }

    @Override
    public void timKiem() {

    }

}
