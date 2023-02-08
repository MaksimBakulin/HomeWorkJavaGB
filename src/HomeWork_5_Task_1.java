public class HomeWork_5_Task_1 {
        public static void main(String[] args) {
            int i = 0;
            int j = 0;
            int z = 0;
            int k = 0;
            int Ni = 0;
            int n = 8;

            int[][] lab = {
                    { 0, 0, 0, 0, 0, 0, 0, 0 },
                    { 0, 0, -1, 0, 0, 0, 0, 0 },
                    { 0, 0, -1, 0, -1, 0, -1, 0 },
                    { 0, 0, -1, 0, 0, 0, -1, 0 },
                    { 0, 0, -1, 0, 0, 0, -1, 0 },
                    { 0, -1, -1, -1, -1, -1, -1, 0 },
                    { 0, 0, -1, 0, 0, 0, -1, 0 },
                    { 0, 0, -1, 0, 0, 0, -1, 0 },
                    { 0, 0, 0, 0, 0, 0, -1, 0 },
                    { 0, 0, 0, 0, 0, 0, -1, 0 },
                    { 0, 0, 0, 0, 0, 0, 0, 0 }
            };

            label : for (int l = 0; l < 1; l++){
                for (i = 0; i < n; i++){
                    for (j = 0; j < n; j++){

                        if (lab[i][j] == Ni && i > 0 && j > 0 && j < n - 1){

                            if(lab[i][j+1] == 0){
                                lab[i][j+1] = Ni+1;
                            }
                            if(lab[i][j+1]== -1){
                                z = i;
                                k = j+1;
                                break label;
                            }

                            if(lab[i+1][j] == 0){
                                lab[i+1][j] = Ni+1;
                            }
                            if(lab[i+1][j]== -1){
                                z = i+1;
                                k = j;
                                break label;

                            }

                            if(lab[i][j-1] == 0){
                                lab[i][j-1] = Ni+1;
                            }
                            if(lab[i][j-1] == -1){
                                z = i;
                                k = j-1;
                                break label;

                            }
                            if(lab[i-1][j] == 0){
                                lab[i-1][j] = Ni+1;
                            }
                            if(lab[i-1][j] == -1){
                                z = i-1;
                                k = j;
                                break label;

                            }


                        }

                    }
                }
//
                Ni++;
            }

            for (i = 0; i < n; i++){
                for (j = 0; j < n; j++){
                    System.out.printf("%4d", lab[i][j]);
                }
                System.out.println();
            }

        }

    }