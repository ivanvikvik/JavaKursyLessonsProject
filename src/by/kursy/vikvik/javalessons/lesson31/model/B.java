package by.kursy.vikvik.javalessons.lesson31.model;

import java.io.*;

public class B extends A implements Externalizable {
    private static final long serialVersionUID = 1L;

    public boolean flag;
    public int field;

    public B() {
    }

    public B(int id) {
        this.id = id;
    }

//    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
//        out.defaultWriteObject();
//        out.writeDouble(value);
//    }
//
//    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException{
//        in.defaultReadObject();
//        value = in.readDouble();
//    }

    @Override
    public String toString() {
        return super.toString() +
                ", flag = " + flag +
                ", field = " + field;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeInt(id);
        out.writeDouble(value);
        out.writeBoolean(flag);
        out.writeInt(field);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        id = in.readInt();
        value = in.readDouble();
        flag = in.readBoolean();
        field = in.readInt();
    }
}
