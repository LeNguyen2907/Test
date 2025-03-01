package service;

import com.example.ktnc_03.model.SinhVien;
import com.example.ktnc_03.service.SinhVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSinhVien {
    List<SinhVien> list;

    @BeforeEach
    public void setUp () {
        list = new ArrayList<>();
        list.add(new SinhVien("SV01", "Hehe", 21, 9, 2, "Chuyen nganh 1"));
    }

    SinhVienService service = new SinhVienService();

    @Test
    public void testUpdateValidNhanVien () {

        service.update(list,new SinhVien("SV01", "Huhu", 20, 9, 2, "Chuyen nganh 1"), 0);

        String exp = "Huhu";
        String act = list.get(0).getTen();

        Assertions.assertEquals(exp, act);
    }
    @Test
    public void testUpdateInValidNhanVien () {


        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {service.update(list, null, 0);});

        String exp = "Nhan vien khong duoc de trong";
        String act = exception.getMessage();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testUpdateInValidMa () {


        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {service.update(list, new SinhVien("", "Hehe", 21, 9, 2, "Chuyen nganh 1"), 0);});

        String exp = "Ma khong duoc de trong";
        String act = exception.getMessage();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testUpdateInValidTen () {


        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {service.update(list, new SinhVien("SV01", "", 21, 9, 2, "Chuyen nganh 1"), 0);});

        String exp = "Ten khong duoc de trong";
        String act = exception.getMessage();

        Assertions.assertEquals(exp, act);
    }
}
