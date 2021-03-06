public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float a = 32.0F;
        float b = 40.0F;
        float[] temp = new float[patientsCount];

        for (int i = 0; i < patientsCount; i++) {
            temp[i] = a + (float) (Math.round((Math.random() * b) * 2.0) / 10.0);
        }
        return temp;
    }

    public static String getReport(float[] temperatureData) {
        int healthyPatients = 0;  // Здоровые пациенты
        double averageTemperature = 0.0;  // Средняя температура
        StringBuilder patientTemperatures = new StringBuilder();

        for (float x : temperatureData) {
            patientTemperatures.append(x).append(" ");
            averageTemperature += x;
            if (x >= 36.2F && x <= 36.9F) {
                healthyPatients += 1;
            }
        }
        averageTemperature = (float) (Math.round(averageTemperature / temperatureData.length * 100.0)) / 100.0;

        return "Температуры пациентов: " + patientTemperatures.toString().trim() +
                "\nСредняя температура: " + averageTemperature +
                "\nКоличество здоровых: " + healthyPatients;
    }
}
