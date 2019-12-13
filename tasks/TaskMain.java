public class TaskMain {

    public static void main(String[] args) {
        new TaskMain().run();
    }

    private void run() {
        boolean value = true;
        Boolean bValue = true;

        ITheme first = new Theme(value);
        ITheme second = new Theme(bValue);

        value = false;
        bValue = Boolean.FALSE;

        first.bind();
        second.bind();

    }

    class Theme implements ITheme {
        private boolean isLight;

        Theme(boolean isLight) {
            this.isLight = isLight;
        }

        @Override
        public void bind() {
            if(isLight) {
                System.out.println("Light theme is enabled");
            } else {
                System.out.println("Dark theme is enabled");
            }
        }
    }

    class ThemeBoolean implements ITheme {
        private Boolean isLight;

        ThemeBoolean(Boolean isLight) {
            this.isLight = isLight;
        }

        @Override
        public void bind() {
            if(isLight){
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
