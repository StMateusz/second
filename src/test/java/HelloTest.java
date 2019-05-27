public class HelloTest {
    @Test
    public void twoWordsShouldBeUnitedBySpaceTest() {
        String result = Hello.concatenate("Hello", "World");
        Assert.assertEquals("Hello World", result);
    }
}
