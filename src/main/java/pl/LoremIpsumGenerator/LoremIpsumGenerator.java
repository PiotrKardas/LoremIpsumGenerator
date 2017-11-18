package pl.LoremIpsumGenerator;

public class LoremIpsumGenerator {
    private int id;
    private String[] arrayOfLorems = new String[5];

    public String[] getArrayOfLorems() {
        return arrayOfLorems;
    }

    public LoremIpsumGenerator() {
        setArrayOfLorems();
    }

    public String getLorem() {
        StringBuilder sb = new StringBuilder();
        while (id-- != 0) {
            sb.append(arrayOfLorems[4-id%5] + "\n");
            sb.append(System.getProperty("line.separator"));
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArrayOfLorems() {
        this.arrayOfLorems[4] ="    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec odio. Fermentum et sollicitudin ac orci. Vitae auctor eu augue ut lectus arcu bibendum at varius. Pulvinar pellentesque habitant morbi tristique senectus et netus et malesuada. Quam quisque id diam vel quam elementum. Libero enim sed faucibus turpis in. Et ligula ullamcorper malesuada proin libero nunc consequat interdum. Lectus vestibulum mattis ullamcorper velit sed. Consequat ac felis donec et odio pellentesque. Nullam eget felis eget nunc. Eu tincidunt tortor aliquam nulla facilisi cras fermentum. Scelerisque eleifend donec pretium vulputate sapien nec sagittis aliquam malesuada. In nibh mauris cursus mattis molestie a iaculis at. Nisl purus in mollis nunc sed. Ante metus dictum at tempor commodo ullamcorper. Gravida arcu ac tortor dignissim convallis. Et ligula ullamcorper malesuada proin libero nunc consequat interdum varius. Sed viverra tellus in hac habitasse platea dictumst vestibulum. Mollis nunc sed id semper risus in. Sed libero enim sed faucibus turpis in eu mi.";

        this.arrayOfLorems[3]="      Morbi leo urna molestie at. Nisl condimentum id venenatis a condimentum vitae. Commodo viverra maecenas accumsan lacus vel facilisis volutpat est velit. Consectetur libero id faucibus nisl tincidunt eget nullam non nisi. Elementum nibh tellus molestie nunc non blandit massa enim nec. Feugiat nibh sed pulvinar proin gravida hendrerit lectus a. Mi proin sed libero enim sed faucibus turpis in. Maecenas accumsan lacus vel facilisis volutpat est velit egestas dui. Pharetra et ultrices neque ornare aenean euismod. Sociis natoque penatibus et magnis dis parturient. Vulputate enim nulla aliquet porttitor lacus luctus accumsan. Tortor condimentum lacinia quis vel eros. Consequat nisl vel pretium lectus quam id. Tellus cras adipiscing enim eu turpis egestas. Donec et odio pellentesque diam volutpat commodo sed egestas egestas. In dictum non consectetur a. Quisque id diam vel quam elementum pulvinar etiam. Suscipit tellus mauris a diam maecenas sed enim ut sem.";

        this.arrayOfLorems[2]="     Lorem ipsum dolor sit amet, vero bonorum legendos no usu. Senectus et netus et malesuada fames ac. Cursus sit amet dictum sit. Purus gravida quis blandit turpis. In nulla posuere sollicitudin aliquam ultrices. Consequat nisl vel pretium lectus. Nulla malesuada pellentesque elit eget gravida cum sociis natoque. Pharetra convallis posuere morbi leo urna molestie. Condimentum vitae sapien pellentesque habitant. Velit egestas dui id ornare arcu odio ut sem nulla. Ut morbi tincidunt augue interdum velit euismod. Auctor augue mauris augue neque gravida in. Mattis nunc sed blandit libero volutpat. Vulputate odio ut enim blandit volutpat maecenas volutpat blandit aliquam. Maecenas sed enim ut sem viverra aliquet eget sit. Sit amet nisl purus in mollis nunc sed. Pretium vulputate sapien nec sagittis aliquam malesuada bibendum. At auctor urna nunc id. Quis viverra nibh cras pulvinar mattis nunc. Blandit libero volutpat sed cras ornare arcu dui vivamus.";

        this.arrayOfLorems[1]="     Ultrices gravida dictum fusce ut placerat orci nulla pellentesque dignissim. Sed felis eget velit aliquet sagittis id consectetur purus ut. Nisi scelerisque eu ultrices vitae auctor eu augue. Malesuada proin libero nunc consequat interdum varius sit. Auctor augue mauris augue neque gravida in fermentum et sollicitudin. Hendrerit gravida rutrum quisque non tellus orci ac. Urna et pharetra pharetra massa massa. Neque convallis a cras semper. Bibendum neque egestas congue quisque egestas diam in arcu cursus. Id volutpat lacus laoreet non curabitur. Magna etiam tempor orci eu lobortis. Quam adipiscing vitae proin sagittis nisl rhoncus. Bibendum neque egestas congue quisque egestas. Vulputate dignissim suspendisse in est ante in nibh. Viverra orci sagittis eu volutpat odio facilisis mauris. Ultrices gravida dictum fusce ut. Nisl tincidunt eget nullam non nisi est.";

        this.arrayOfLorems[0]="     Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Aliquet risus feugiat in ante metus dictum at tempor commodo. Nisi scelerisque eu ultrices vitae auctor eu. Cras ornare arcu dui vivamus arcu felis bibendum ut tristique. Neque sodales ut etiam sit amet nisl. Ultrices gravida dictum fusce ut placerat. Arcu odio ut sem nulla pharetra diam sit amet nisl. Hac habitasse platea dictumst quisque sagittis purus sit amet volutpat. Scelerisque varius morbi enim nunc faucibus a pellentesque sit. Libero volutpat sed cras ornare arcu. In fermentum posuere urna nec tincidunt praesent semper feugiat nibh. Arcu risus quis varius quam quisque id diam vel quam. Quam viverra orci sagittis eu volutpat odio facilisis mauris sit. Imperdiet massa tincidunt nunc pulvinar sapien et ligula ullamcorper malesuada. Ridiculus mus mauris vitae ultricies leo integer malesuada nunc vel. Nec feugiat nisl pretium fusce id velit ut tortor pretium.";
    }
}
