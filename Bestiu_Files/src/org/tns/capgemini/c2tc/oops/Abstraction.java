package org.tns.capgemini.c2tc.oops;

abstract class MaheshDemo  
{
     public void calling()
		{
			System.out.println("Calling");
		}
		public abstract void AIIntegration();
		public abstract void SatelliteComm();
		public abstract void HealthMonitoring();
		
	}
	abstract class  RameshDemo extends MaheshDemo    
	{
		public void AIIntegration()
		{
			System.out.println("Phone is integration with AI");
		}
	}
	class SureshDemo extends RameshDemo   
	{
		public void SatelliteComm() //concrete method
		{
			System.out.println("Phone is integrated with satelitecomm");
		}
		public void HealthMonitoring()
		{
			System.out.println("Phone is integrated with HealthMonitoring");
		}
	

}
 public class Abstraction {

		public static void main(String[] args) {
			MaheshDemo obj= new SureshDemo();
			obj.calling();
			obj.AIIntegration();
			obj.SatelliteComm();
			obj.HealthMonitoring();

		}

	}
