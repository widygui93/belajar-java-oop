package programmer.zaman.now.data;

public interface Car extends HasBrand, IsMaintenance{
    // ga perlu tulis public abstract
    // karena sudah implisit
    void drive();

    int getTier();

    // class yg meng implement interface ini
    // tidak wajib mengoveride method ini
    default boolean isBig(){
        return false;
    }

}
