class MyThread1 extends Thread{
    public void run(){
        System.out.println("Thread1 is running");
    }
}

class Mythread2 extends Thread{
    public void run(){
        System.out.println("Thread2 is running");
    }
}

class ThreadExample{
    public static void main(String[] args) {
        MyThread1 ob1 = new MyThread1();
        Mythread2 ob2 = new Mythread2();

        ob1.start();
        ob2.start();
    }
}