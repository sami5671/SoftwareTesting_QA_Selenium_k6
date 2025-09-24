// A total number of iterations is distributed across all VUs.
import http from "k6/http";
import { check } from "k6";

export const options = {
  scenarios: {
    default: {
      executor: "shared-iterations",
      vus: 100,
      iterations: 500,
      maxDuration: "30s",
    },
  },
};
export default function () {
  const url = "https://plant-server-v2-0.vercel.app/auth/login/";
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
