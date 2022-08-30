package com.cg.concurrency;
import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ConcurrencyDemo {

	public static void main(String[] args) throws ExecutionException {
		//lambda expression for Runnable Interface(Functional Interface)
		Runnable r=()->
		{
			try
			{
				TimeUnit.MILLISECONDS.sleep(3000);
				System.out.println("CURRENT TIME:  "+LocalDateTime.now());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		};
		//executors service instance
		ExecutorService obj=Executors.newFixedThreadPool(10);
		obj.execute(r);
		Future<String> res=obj.submit(r,"DONE");
		//isDone()->if task is completed it reyirns true else false
		
		while(res.isDone()==false)
		{
			try
			{
				System.out.println("THE METHOD RETURNS VALUE: "+res.get());
				break;
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			try
			{
				Thread.sleep(2000L);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		obj.shutdown();

	}

	

}