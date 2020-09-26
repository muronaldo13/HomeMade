FROM node:13.12.0-alpine
RUN mkdir /frontend
WORKDIR /frontend
ENV PATH /frontend/node_modules/.bin:$PATH
COPY package.json ./
COPY package-lock.json ./
COPY . ./
RUN npm install --silent
RUN npm install react-scripts@3.4.1 -g --silent
ENTRYPOINT [ "npm", "start" ]