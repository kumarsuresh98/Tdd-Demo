package com.example.tdd.tdddemo;

import com.example.tdd.tdddemo.com.util.DoubleEnum;
import com.example.tdd.tdddemo.com.util.RoleEnum;
import org.junit.Test;

public class EnumTest {

    @Test
    public void testEnum() {
        String str = "clerk";
        RoleEnum role=RoleEnum.valueOf(str.toUpperCase());
        System.out.println(role);
        String str1=role.toString();
        System.out.println(str1);

        DoubleEnum de=DoubleEnum.valueOf("INSECURE");
        System.out.println(de.toString());

    }
}
