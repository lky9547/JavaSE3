package com.lky.test1;

/**
 * @author shkstart
 * @Description
 * @date 2022-11-06-22:10
 */
public class Test01 {

        public int computing(int x, int y)
        {
            int result;
            if (x < 5 && y == 5) {
                result = x + y;
            } else {
                result= x / y;
            }
            return result;
        }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        int computing = test01.computing(6, 6);
        System.out.println(computing);
        System.out.println(111);
    }
}
