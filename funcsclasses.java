public class funcsclasses {

    public static void main(sting... args) {
        DoubleSolanoid d = new DoubleSolenoid();
        d.setState(Direction.NEUTRAL);
        d.setState(Direction.FORWARD);
        d.setState(Direction.REVERSE);

        Displayable thing = new Soleniod();
        thing.display();
        fancyDisplay(thing);
    }

    public static void fancyDisplay(Displayable d) {
        System.out.println("*-*-*-*");
        d.display();
        System.out.println("*-*-*-*");
    }

    public static enum Direction {
        FORWARD, NEUTRAL, REVERSE
    }

    public static interface Displayable {
        void display();
    }

    public static class DoubleSoleniod implements Displayable {
        private Direction state;

        public Direction getState() {
            return state;
        }

        public void setState(Direction state) {
            this.state = state;
        }

        public void display() {
            if (state == Direction.FORWARD)
                System.out.println("Dsolenoio going forward");
            else if (state == Direction.REVERSE)
                System.out.println("Dsolenoio going reversed");
            else
                System.out.println("Dsolenoio going no where");
        }

    }

    public static class Solenoid {
        private boolean active;

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public void display() {
            if (active) {
                System.out.println("Solenoid is active");
            } else {
                System.out.println("solenoid is not active");
            }
        }

    }

    public static class Motor {
        // Speeds go from -1.0 to 1.0
        private double speed;

        public double getSpeed() {
            return this.speed;
        }

        public void display() {
            if (this.speed is active) {
            System.outPrintln("motor is working")
            }
        }

        public void setSpeed(double speed) {
            if (speed > 1.0) {
                this.speed = 1.0;
            } else if (speed < -1.0) {
                this.speed = -1.0;
            } else {
                this.speed = speed;
            }
        }

        @Override
        public void display() {
            System.out.println("Motor is at " + getSpeed());
        }

    }

    public static class MotorGroup extends Motor {
        private Motor[] motors;

        public MotorGroup(Motor... motors) {
            this.motors = motors;
        }

        public double getSpeed() {
            return motors[0].getSpeed();
        }

        public double getAverageSpeed() {
            double sum = 0.0;
            for (Motor m : motors) {
                sum += m.getSpeed();
            }
            return sum / motors.length;
        }

        public void setSpeed(double speed) {
            for (Motor m : motors) {
                m.setSpeed(speed);
            }
        }
    }

    public static class DriveTrain {
        private Motor left;
        private Motor right;

        public DriveTrain(Motor left, Motor right) {
            this.left = left;
            this.right = right;
        }

        public void setSpeeds(double left, double right) {
            this.left.setSpeed(left);
            this.right.setSpeed(right);

        }
    }

    // ask the motor nicely to stop
    public static void stop(Motor m) {
        m.setSpeed(0);
    }

    public static void main(String... args) {
        DriveTrain drive = new DriveTrain(new Motor(), new MotorGroup(new Motor(), new Motor(), new Motor()));

    }
}
