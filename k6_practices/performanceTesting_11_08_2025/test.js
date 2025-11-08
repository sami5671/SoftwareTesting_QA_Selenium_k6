import http from "k6/http";
import { check } from "k6";
import { Rate } from "k6/metrics";

const failures = new Rate("failed_requests");

export const options = {
  vus: 10,
  duration: "10s",
  thresholds: {
    failed_requests: ["rate<=0"],
    http_req_duration: ["p(95)<500"],
  },
};
export default function () {
  const result = http.get("https://test-api.k6.io/");
  check(result, {
    "http response status is 200": (r) => r.status === 200,
  });
  failures.add(result.status !== 200);
}
