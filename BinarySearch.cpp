#include <vector>
#include <algorithm>
#include <iostream>
#include <iomanip>
#include <fstream>

using namespace std;

int binary_search(vector<double> nums, double target)
{
    sort(nums.begin(), nums.end());
    int left = 0;
    int right = nums.size() - 1;
    while (left < right)
    {
        int mid = left + (right - left) / 2; // overflow
        double candidate = nums[mid];
        if (candidate == target)
        {
            return mid;
        }
        else if (candidate > target)
        {
            right = mid - 1;
        }
        else
        {
            left = mid + 1;
        }
    }
    return left;
}

int main(int argc, char const *argv[])
{
    vector<double> nums;

    ifstream in("numbers.txt");

    double element;
    while (in >> element)
    {
        nums.push_back(element);
    }

    int index = binary_search(nums, 6.4365789F);
    cout << index << " " << nums[index] << setprecision(10) << "\n";
    return 0;
}
