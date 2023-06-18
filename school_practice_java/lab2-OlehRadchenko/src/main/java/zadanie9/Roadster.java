package zadanie9;

public class Roadster {
    private float topSpeed, acceleration, crazyTopSpeed, crazyAcceleration;
    private boolean crazyMode;

    public Roadster(float topSpeed, float acceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
    }

    public Roadster(float topSpeed, float acceleration, float crazyTopSpeed, float crazyAcceleration) {
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.crazyTopSpeed = crazyTopSpeed;
        this.crazyAcceleration = crazyAcceleration;
        this.crazyMode = true;
    }

    public float getTopSpeed() {
        return topSpeed;
    }
    public float getTopSpeed(boolean crazyMode) {
        if(crazyMode) {
            return crazyTopSpeed;
        }else{
            return topSpeed;
        }
    }

    public float getAcceleration() {
        return acceleration;
    }
    public float getAcceleration(boolean crazyMode) {
        if(crazyMode) {
            return crazyAcceleration;
        }else{
            return acceleration;
        }
    }
}
