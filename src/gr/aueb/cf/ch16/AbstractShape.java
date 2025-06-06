package gr.aueb.cf.ch16;

abstract class  AbstractShape implements IShape {

    private long id;

    AbstractShape() {
        //super()
    }


    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
