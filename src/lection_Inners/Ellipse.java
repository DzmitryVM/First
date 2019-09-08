package lection_Inners;

class Ellipse implements Shape.Round {
    private static final String NAME = "Ellipse";
    private double minHalfShaft, maxHalfShaft;

    public Ellipse (double minHalfShaft, double maxHalfShaft) {
        this.minHalfShaft = minHalfShaft;
        this.maxHalfShaft = maxHalfShaft;
    }

    @Override                                  // переопределяем методы внешних классов
    public String getName(){
        return NAME;
    }

    @Override
    public boolean notZeroAndExist (){
        boolean checkZero = true;
        if(minHalfShaft<=0 || maxHalfShaft<=0){
            boolean zeroTrue = false;
            checkZero = zeroTrue;
        }
        return checkZero;
    }

    @Override
    public double getSpace(){
        return Math.PI*minHalfShaft*maxHalfShaft;
    }

    @Override
    public boolean compareSpace(double compare){
        return (getSpace()== compare);
    }

    @Override
    public String toString(){
        StringBuilder infoClass = new StringBuilder();
        return (infoClass.append(getName()).append(" with half shafts ").append(minHalfShaft).append(" and ").append(maxHalfShaft).toString());
    }

    @Override
    public double getRoundLength(){
        return Math.PI*(minHalfShaft+maxHalfShaft);
    }
}
