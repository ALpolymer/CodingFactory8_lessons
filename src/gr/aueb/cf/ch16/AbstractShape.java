package gr.aueb.cf.ch16;

abstract class  AbstractShape implements IShape {

    AbstractShape() {
        //super()
    }

    private long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
