package com.standardClass14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex1 {
    public static void main(String[] args) {
        // 1. 현재의 날짜를 Date 형으로 얻는다.
        Date now = new Date();
        System.out.println(now);

        // 2. 얻은 날짜정보를 Calendar 에 설정한다.
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        
        // 3. Calendar 에서 일(day) 값을 얻는다.
        System.out.println(calendar.get(Calendar.DATE));
        
        // 4. 얻은 값에 100을 더한 값을 Calendar 의 일 에 설정한다.
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 100);
        System.out.println(calendar.get(Calendar.DATE));
        
        // 5. Calendar 의 날짜정보를 Date 형으로 변환한다.
        Date dateCalendar = calendar.getTime();
        System.out.println(dateCalendar);
        
        // 6. SimpleDateFormat 을 이용하여 Date 인스턴스의 내용을 표시한다.
        //  현재의 100일 후의 날짜 를 “서기 2011년 09월 24일” 와 같은 형식으로 표시하시오.
        SimpleDateFormat format = new SimpleDateFormat("서기 yyyy년 MM월 dd일");
        System.out.println(format.format(dateCalendar)); 
    }
}
