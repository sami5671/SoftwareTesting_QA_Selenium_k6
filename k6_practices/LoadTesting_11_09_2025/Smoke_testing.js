import http from "k6/http";
import { check, sleep } from "k6";

export const options = {
  vus: 3,
  duration: "1m",
};

export default () => {
  const urlRes = http.get("https://quickpizza.grafana.com");
  check(urlRes, { "status returned 200": (r) => r.status == 200 });
  sleep(1);
};
