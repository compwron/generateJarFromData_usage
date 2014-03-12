package example;

import org.junit.Test;
import populator.item.Cls;
import presenter.Hierarchy;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ExampleTest {
    @Test
    public void shouldFindCls(){
        Cls cls = new Hierarchy().getItemHierarchy().getDivisions().get(0).getDepartments().get(0).getClsList().get(0);
        assertThat(cls, is(new Cls("XXXXXXXXXXXXXXXXXXXXXXXXX   XXXXX")));
    }
}
