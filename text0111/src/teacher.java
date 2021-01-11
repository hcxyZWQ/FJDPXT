class Teacher extends User{
        private String zhicheng;

        public Teacher( String zhicheng) {
            this.zhicheng = zhicheng;
        }

        public String getZhicheng() {
            return zhicheng;
        }

        public void setZhicheng(String zhicheng) {
            this.zhicheng = zhicheng;
        }

        @Override
        public String toString() {
            return "Teaxher{" +
                    "zhicheng='" + zhicheng + '\'' +
                    '}';
        }
    }
