class Car {
private String model ;
private boolean isEngineOn;
	
	public Car(String model){

		this.model = model;
		this.isEngineOn = false;
	}
    class Engine{
	void start(){
		if(!isEngineOn){
			isEngineOn = true;
			System.out.println(model +" engine started ");
		}else{
			System.out.println(model +" engine is already started  ");
		}
	}
	void stop(){
		if(isEngineOn){
			isEngineOn=false;
			System.out.println(model + "engine stopped  ");
		}else{
			System.out.println(model +" engine already stoped ");
		}
	}

     }

	public static void main(String[] args ){
		Car c = new Car("innova");
		Car.Engine engine = c. new Engine(); 
		engine.start();
		engine.stop();

	
	
	}
}
