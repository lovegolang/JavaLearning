package com.woshidaniu.concurrency.threaddemo.DeadLock;

/**
 * Created by kang on 2018/7/3.
 */
public class Thread0 extends Thread
{
    private DeadLock dl;

    public Thread0(DeadLock dl)
    {
        this.dl = dl;
    }

    public void run()
    {
        try
        {
            dl.leftRight();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}