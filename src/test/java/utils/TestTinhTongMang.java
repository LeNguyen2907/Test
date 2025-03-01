package utils;

import com.example.ktnc_03.utils.TinhTongMang;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTinhTongMang {

    TinhTongMang tinh = new TinhTongMang();

    @Test
    public void testTinhTongMangSoNguyenDuong () {

        int exp = 45;
        int act = tinh.tinhTongMangSoNguyen(new int [] {1, 4, 7, 9, 10, 14});

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTinhTongMangSoNguyenAm () {

        int exp = -45;
        int act = tinh.tinhTongMangSoNguyen(new int [] {-1, -4, -7, -9, -10, -14});

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTinhTongMangSoNguyenChua_0 () {

        int exp = 31;
        int act = tinh.tinhTongMangSoNguyen(new int [] {1, 4, 7, 9, 10, 0});

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testTinhTongMangSoNguyenTrong () {

        int exp = 0;
        int act = tinh.tinhTongMangSoNguyen(new int [] {});

        Assertions.assertEquals(exp, act);
    }
}
