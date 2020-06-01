import tech.units.indriya.AbstractUnit;
import tech.units.indriya.format.FormatBehavior;
import tech.units.indriya.format.NumberDelimiterQuantityFormat;

import javax.measure.spi.ServiceProvider;

public class MultiReleaseDemo {
    public static void main(String[] args) {
        var parsed = AbstractUnit.parse("%");
        System.out.println(parsed);

        parsed = AbstractUnit.parse("W");
        System.out.println(parsed);

        var unitFormat = ServiceProvider.current().getFormatService().getUnitFormat();
        parsed = unitFormat.parse("V");
        System.out.println(parsed);

        var u = ServiceProvider.current().getFormatService().getUnitFormat().parse("g/l");
        System.out.println(u);
        var formatStyle = NumberFormatStyle.DEFAULT;
        var quantFormat = NumberDelimiterQuantityFormat.getCompactInstance(FormatBehavior.LOCALE_NEUTRAL);
    }
}
