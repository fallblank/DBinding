package kale.dbinding;

import java.io.File;

/**
 * @author Kale
 * @date 2016/1/31
 */
public class Test {

    private static final String ROOT = System.getProperty("user.dir");

    public static void main(String[] args) {
        System.out.print("===== start ");
        long start = System.currentTimeMillis();
        String moduleDir = ROOT + File.separator + "app" + File.separator;

        GenViewModel.generateViewModel(moduleDir);

        System.out.println("===== end =====> Total time is: " + (System.currentTimeMillis() - start) + "ms");
    }

}
