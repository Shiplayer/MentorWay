public class TaskMain2 {

    public static void main(String[] args) {
        new TaskMain2().run();
    }

    private class ThemeValue {
        private boolean value;

        ThemeValue(boolean value){
            this.value = value;
        }

        boolean isValue() {
            return value;
        }

        void setValue(boolean value) {
            this.value = value;
        }
    }

    private void run() {
        ThemeValue value = new ThemeValue(true);

        ITheme first = new Theme(value);

        value.setValue(false);

        first.bind();

    }

    class Theme implements ITheme {
        private ThemeValue isLight;

        Theme(ThemeValue isLight) {
            this.isLight = isLight;
        }

        @Override
        public void bind() {
            if(isLight.isValue()) {
                System.out.println("Light theme is enabled");
            } else {
                System.out.println("Dark theme is enabled");
            }
        }
    }

    interface ITheme {
        void bind();
    }
}
