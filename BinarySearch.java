import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        double[] nums = { 0.050001179F, 0.100002787F, 0.150003863F, 0.200004978F, 0.25000885F, 0.300001207F,
                0.350007125F, 0.40000715F, 0.450006792F, 0.500006484F, 0.550004584F, 0.600005875F, 0.650004642F,
                0.70000696F, 0.750002786F, 0.800004395F, 0.850008759F, 0.900000281F, 0.950008226F, 1.000009273F,
                1.050009825F, 1.100008829F, 1.150007824F, 1.200003239F, 1.250008418F, 1.300006231F, 1.350007879F,
                1.400009964F, 1.450000143F, 1.500006756F, 1.550008166F, 1.600009424F, 1.650003905F, 1.700006994F,
                1.750004617F, 1.800006542F, 1.850002235F, 1.90000667F, 1.950002785F, 2.000009954F, 2.050002996F,
                2.100008898F, 2.150004081F, 2.20000169F, 2.250003784F, 2.300003448F, 2.350005305F, 2.400008835F,
                2.450006869F, 2.500004585F, 2.550009935F, 2.600003902F, 2.650004602F, 2.700005666F, 2.750007129F,
                2.800000245F, 2.850009696F, 2.900000265F, 2.950003133F, 3.000004421F, 3.050006672F, 3.1000077F,
                3.150003357F, 3.200005071F, 3.250001634F, 3.300004674F, 3.350002698F, 3.400004926F, 3.450003448F,
                3.500002878F, 3.550007984F, 3.600003458F, 3.650006803F, 3.700000677F, 3.750005661F, 3.800002723F,
                3.850001033F, 3.900005207F, 3.950006904F, 4.000007874F, 4.050003654F, 4.100006703F, 4.150002491F,
                4.200009472F, 4.250003079F, 4.300007301F, 4.350007875F, 4.400008451F, 4.450000347F, 4.50000258F,
                4.550009602F, 4.600007578F, 4.650002342F, 4.700005618F, 4.750008792F, 4.800004279F, 4.850005554F,
                4.900003283F, 4.950001102F, 5.000000364F, 5.050005297F, 5.100003496F, 5.150006161F, 5.200004714F,
                5.250002737F, 5.300005094F, 5.350007389F, 5.400009604F, 5.450002501F, 5.500006181F, 5.550005891F,
                5.600000919F, 5.650007743F, 5.700008432F, 5.750004417F, 5.800002079F, 5.850005114F, 5.900006289F,
                5.950003282F, 6.000009835F, 6.050007F, 6.100004056F, 6.150008447F, 6.200006212F, 6.250006468F,
                6.300002865F, 6.350004118F, 6.400001078F, 6.450005492F, 6.500006446F, 6.55000385F, 6.600002115F,
                6.65000333F, 6.700002621F, 6.750004647F, 6.800006079F, 6.850009534F, 6.900006443F, 6.950009776F,
                7.000008271F, 7.050004979F, 7.100004808F, 7.150009559F, 7.200009109F, 7.25000717F, 7.300002631F,
                7.350008992F, 7.400004459F, 7.450007245F, 7.500008062F, 7.550006083F, 7.600001664F, 7.650005953F,
                7.700009748F, 7.750008393F, 7.800009896F, 7.850002353F, 7.900008112F, 7.950000059F, 8.000009469F,
                8.050003822F, 8.100008303F, 8.150009241F, 8.200004954F, 8.250009224F, 8.300009343F, 8.350008981F,
                8.400008711F, 8.450002497F, 8.500001384F, 8.550002178F, 8.600008925F, 8.650007021F, 8.700009456F,
                8.750003809F, 8.800003832F, 8.850004738F, 8.900000932F, 8.950000405F, 9.00000785F, 9.050003283F,
                9.100005629F, 9.15000032F, 9.200001847F, 9.250003907F, 9.300000071F, 9.350006027F, 9.400004041F,
                9.450005748F, 9.500009489F, 9.55000942F, 9.600002875F, 9.650007617F, 9.700002093F, 9.750004039F,
                9.800003276F, 9.850008311F, 9.900001614F, 9.950006287F, 10.00000297F, 10.05000408F, 10.100006F,
                10.1500018F, 10.20000245F, 10.25000475F, 10.30000192F, 10.35000118F, 10.40000437F, 10.45000113F,
                10.50000164F, 10.55000704F, 10.60000694F, 10.65000841F, 10.70000638F, 10.750003F, 10.80000447F,
                10.85000877F, 10.90000691F, 10.95000805F, 11.00000013F, 11.05000307F, 11.1000024F, 11.15000562F,
                11.20000089F, 11.25000649F, 11.30000794F, 11.35000965F, 11.40000554F, 11.45000306F, 11.50000577F,
                11.55000419F, 11.60000361F, 11.6500064F, 11.7000036F, 11.7500088F, 11.80000011F, 11.85000815F,
                11.90000903F, 11.95000258F, 12.00000848F, 12.05000099F, 12.10000111F, 12.15000558F, 12.20000977F,
                12.25000165F, 12.30000567F, 12.35000212F, 12.40000528F, 12.45000311F, 12.50000455F, 12.55000464F,
                12.60000566F, 12.6500053F, 12.70000451F, 12.75000792F, 12.80000044F, 12.85000926F, 12.90000903F,
                12.95000793F, 13.00000992F, 13.05000282F, 13.1000049F, 13.1500044F, 13.20000161F, 13.25000101F,
                13.30000192F, 13.35000887F, 13.40000257F, 13.45000994F, 13.50000335F, 13.55000941F, 13.60000814F,
                13.65000446F, 13.70000788F, 13.75000779F, 13.80000318F, 13.85000029F, 13.90000147F, 13.95000046F,
                14.00000181F, 14.05000702F, 14.10000124F, 14.15000178F, 14.20000889F, 14.25000585F, 14.30000685F,
                14.35000378F, 14.40000795F, 14.45000059F, 14.50000363F, 14.55000625F, 14.60000639F, 14.65000318F,
                14.7000068F, 14.75000848F, 14.8000097F, 14.85000833F, 14.90000177F, 14.95000094F, 15.00000737F,
                15.05000375F, 15.1000064F, 15.15000754F, 15.20000458F, 15.25000443F, 15.30000271F, 15.35000408F,
                15.40000514F, 15.45000563F, 15.50000146F, 15.55000547F, 15.6000091F, 15.65000296F, 15.7000023F,
                15.7500096F, 15.8000026F, 15.85000931F, 15.90000425F, 15.95000882F, 16.00000785F, 16.05000128F,
                16.10000802F, 16.15000794F, 16.20000027F, 16.25000588F, 16.30000388F, 16.3500034F, 16.40000091F,
                16.45000989F, 16.50000256F, 16.5500015F, 16.60000883F, 16.65000464F, 16.70000318F, 16.75000706F,
                16.80000949F, 16.85000374F, 16.90000649F, 16.9500088F, 17.00000661F, 17.05000968F, 17.10000728F,
                17.1500035F, 17.2000026F, 17.25000854F, 17.30000884F, 17.35000896F, 17.40000105F, 17.45000648F,
                17.50000221F, 17.55000162F, 17.60000813F, 17.65000645F, 17.70000321F, 17.7500051F, 17.80000172F,
                17.85000338F, 17.90000196F, 17.95000417F, 18.00000845F, 18.05000383F, 18.10000138F, 18.15000193F,
                18.20000754F, 18.25000262F, 18.30000142F, 18.3500023F, 18.40000551F, 18.45000034F, 18.50000001F,
                18.55000442F, 18.6000024F, 18.6500004F, 18.70000321F, 18.75000375F, 18.80000102F, 18.85000921F,
                18.90000911F, 18.95000172F, 19.00000972F, 19.05000986F };
        Arrays.sort(nums);
        int index = binarySearch(nums, 6.4365789F);
        int index2 = binarySearch(nums, 21F);
        System.out.println(index);
        System.out.println(nums[index]);
        System.out.println(index2);
        System.out.println(nums[index2]);
    }

    public static int binarySearch(double[] nums, float target) {
        // Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            double candidate = nums[mid];
            if (candidate == target) {
                return mid;
            } else if (candidate > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}