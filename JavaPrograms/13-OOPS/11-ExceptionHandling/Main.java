package com.OOPS.ExceptionHandling;

import javax.swing.text.TableView;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;


//        try{
////            int c = a / b;
////            divide(a,b);
//            throw new Throwable("just for fun");
//        } catch (ArithmeticException e) {
//            System.out.println("ArithmeticException is found");
//        } catch (RuntimeException e) {
//            System.out.println("RuntimeException is found");
//        } catch (Exception e) {
//            System.out.println("Exception is found");
//        } catch (Throwable e) {
//            System.out.println("Throwable is found");
//        } finally {
//            System.out.println("Program executed finally");
//        }


        // Running myException:

        try{
            String name = "Rambabu";
                if(name.equals("Rambabu")) {
                    throw new MyException("I am Rambabu");
                }
            } catch(MyException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
            System.out.println("Program is over");
            }


    }



    public static int divide(int a, int b) throws ArithmeticException {
        if( b == 0) {
            throw new ArithmeticException("Please don't divide with zero");
        }

        return a / b;
    }

}
