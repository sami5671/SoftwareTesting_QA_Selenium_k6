// A total number of iterations is distributed across all VUs.

import http from "k6/http";
import { sleep } from "k6";

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
  http.get("https://plant-server-v2-0.vercel.app/plant/getAllPlants");
  sleep(1);
}
