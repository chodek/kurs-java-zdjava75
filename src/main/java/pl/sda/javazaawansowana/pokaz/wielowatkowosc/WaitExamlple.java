package pl.sda.javazaawansowana.pokaz.wielowatkowosc;

import lombok.Data;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class WaitExamlple {

    AtomicInteger atomicInteger;
    AtomicIntegerArray atomicIntegerArray;
    volatile int wiek;

    public static void main(String[] args) {


        final Customer customer = new Customer();
        final Thread withDrawThread = new Thread(new WithdrawThread(customer));
        final Thread depositThread1 = new Thread(new DepositThread(customer));
        final Thread depositThread2 = new Thread(new DepositThread(customer));

        withDrawThread.start();
        depositThread1.start();
        depositThread2.start();


        System.out.println(customer.getAvailableMoney());

    }
}


class WithdrawThread implements Runnable{
    private final Customer customer;

    public WithdrawThread(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
       customer.withdraw(100);
    }
}

class DepositThread implements Runnable{
    private final Customer customer;

    public DepositThread(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        customer.deposit(50);
    }
}

@Data
class Customer {
    private int availableMoney = 0;

    synchronized void withdraw(final int amountToWithdraw) {


        System.out.println("Wyciagm: " + amountToWithdraw + " PLN");
        while (availableMoney < amountToWithdraw) {
            System.out.println("Za malo pieniedzy, czekam az dostaniesz wyplate");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Wyplata sie udala!");
    }


    synchronized void deposit(final int amountToDeposit) {
        System.out.println("Wplaciles: " + amountToDeposit + "PLN");
        availableMoney += amountToDeposit;
        notify();
        notify();
    }
}







