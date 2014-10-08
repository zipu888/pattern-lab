package decorator;

/**
 * Created by xiaohao on 2014/10/8.
 *
 * BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
 * System.in is an InputStream object
 */
public class Main {

    public static void main(String[] args) {
        Girl girl = new AmericanGirl();

        System.out.println(girl.getDescription());

        Science science = new Science(girl);

        System.out.println(science.getDescription());

        Art art = new Art(science);

        System.out.println(art.getDescription());

        //Girl g = new Science(new Art(new AmericanGirl()));

    }

}
