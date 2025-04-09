
class SoberWalk {
    public static void main(String[] args) {
        
        int n = 3; // Number of steps
        char direction = 'R'; // Starting direction is 'Right'
        int x = 0, y = 0; // Starting position
        int stepSize=10;
        // Continue pattern for n steps
        while (n > 0) {
            switch (direction) {
                case 'R': // Move right
                    x +=stepSize;
                    direction = 'U'; // Next move is upward
                    break;

                case 'U': // Move upward
                    y+=stepSize;
                    direction = 'L'; // Next move is left
                    break;

                case 'L': // Move left
                    x-=stepSize;
                    direction = 'D'; // Next move is downward
                    break;

                case 'D': // Move downward
                    y-=stepSize; // Negative y direction
                    direction = 'R'; // Loop back to starting direction
                    break;
            }
            n--; // Decrease the step count
        }

        // Final position
        System.out.println(x + " " + y);
    }
    
}
