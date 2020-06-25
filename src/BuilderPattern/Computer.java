package BuilderPattern;

import java.util.ArrayList;

/**
 * Design pattern
 * 电脑实体类
 *
 * @author : stc
 * @date : 2020-06-21 19:05
 **/
public class Computer {
    private ArrayList<String> parts = new ArrayList<>();

    public void Add(String part){
        parts.add(part);
    }

    public void Show(){
        for (String part : parts){
            System.out.println("电脑组装了："+part);
        }
        System.out.println("电脑组装完毕");
    }
}
