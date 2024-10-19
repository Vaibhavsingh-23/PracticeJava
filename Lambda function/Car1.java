class Car1{
	String model;
	boolean isEngineOn = true;
	void Car(String model){
	model = model;
	}
class Engine{
	void start(){
		if(isEngineOn){
		isEngineOn=true;
		System.out.println(model +"engine is on");
		}
	}
	void stop(){
	if(isEngineOn){
	System.out.println(model+"engine is off now");
	}
	
	}
}
public static void main(String[] args){
	Car c = new Car("Safari");
	Car.Engine e = c. new Engine();
	e.start();
	e.stop();

}
}