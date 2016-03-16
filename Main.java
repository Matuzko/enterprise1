package enterprise1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter logWriter = null;
                
        try {
            logWriter = new FileWriter("results.txt");

            CollectionsBase collectionsBase10000 = new CollectionsBase(10000);
            CollectionsBase collectionsBase100000 = new CollectionsBase(100000);
            CollectionsBase collectionsBase1000000 = new CollectionsBase(1000000);

            logWriter.write(collectionsBase10000.addEfectivity(100));
            logWriter.write("\n" + "\n");
            logWriter.write(collectionsBase100000.addEfectivity(100));
            logWriter.write("\n" + "\n");
            logWriter.write(collectionsBase1000000.addEfectivity(100));
            logWriter.write("\n" + "\n");

            logWriter.write(collectionsBase10000.getEffectivity(100));
            logWriter.write("\n" + "\n");
            logWriter.write(collectionsBase100000.getEffectivity(100));
            logWriter.write("\n" + "\n");
            logWriter.write(collectionsBase1000000.getEffectivity(100));
            logWriter.write("\n" + "\n");

            logWriter.write(collectionsBase10000.removeEffectivity(100));
            logWriter.write("\n" + "\n");
            logWriter.write(collectionsBase100000.removeEffectivity(100));
            logWriter.write("\n" + "\n");
            logWriter.write(collectionsBase1000000.removeEffectivity(100));
            logWriter.write("\n" + "\n");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (logWriter != null) {
                logWriter.close();
            }
        }
    }
}
