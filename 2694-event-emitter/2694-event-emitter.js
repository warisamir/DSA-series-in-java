class EventEmitter {
    events={}
  subscribe(event, cb) {
      this.events[event]=this.events[event]||[];
      this.events[event].push(cb);
    return {
        unsubscribe: () => {
            this.events[event]=this.events[event].filter(fn=>fn!==cb)
        }
    };
  }

  emit(event, args = []) {
const res=[];
       if(this.events[event]){
      for(let fn of this.events[event]){
        res.push(fn(...args));
      }
    }
    return res;
  }
}

/**
 * const emitter = new EventEmitter();
 *
 * // Subscribe to the onClick event with onClickCallback
 * function onClickCallback() { return 99 }
 * const sub = emitter.subscribe('onClick', onClickCallback);
 *
 * emitter.emit('onClick'); // [99]
 * sub.unsubscribe(); // undefined
 * emitter.emit('onClick'); // []
 */