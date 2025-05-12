public class Polynomial {
  double[] coefficients;

  Polynomial() {
    coefficients = new double[1];
    coefficients[0] = 0;
  }

  Polynomial(double[] nums) {
    coefficients = new double[nums.length];
    for (int i = 0; i < nums.length; i++) {
      coefficients[i] = nums[i];
    }
  }

  Polynomial add(Polynomial nums) {
    for (int i = 0; i < this.coefficients.length; i++) {
      this.coefficients[i] += nums.coefficients[i];
    }
    return this;
  }

  double evaluate(double x) {

    double ans = 0.0;
    for (int i = 0; i < this.coefficients.length; i++) {
      ans += this.coefficients[i] * Math.pow(x, i);
    }
    return ans;
  }

  boolean hasRoot(double x) {
    if (this.coefficients.length == 1 && this.coefficients[0] == 0) {
      return false;
    }
    return evaluate(x) == 0;
  }
}
