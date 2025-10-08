// Each VU (virtual user) runs a fixed number of iterations.

import http from "k6/http";
import { check } from "k6";

export const options = {
  cloud: {
    projectID: 4650754,
    name: "Test (24/09/2025-17:15:08)",
  },
  thresholds: {
    http_req_failed: ["rate<0.01"],
    http_req_duration: ["p(95)<1000"],
  },
  scenarios: {
    default: {
      executor: "per-vu-iterations",
      vus: 25,
      iterations: 100,
      maxDuration: "30s",
    },
  },
};
export default function () {
  const url = "https://plant-server-v2-0.vercel.app/auth/login/";
  // const url = "http://localhost:8000/auth/login/";
  const payload = JSON.stringify({
    email: "bepari@gmail.com",
    password: "1234",
  });

  const params = {
    headers: {
      "Content-Type": "application/json",
    },
  };
  const res = http.post(url, payload, params);
  check(res, {
    "is status 200": (r) => r.status === 200,
    "is res body has email": (r) => r.body.includes("bepari@gmail.com"),
  });
}

// /user/login/
