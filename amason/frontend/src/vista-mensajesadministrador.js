import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-mensaje.js';

class VistaMensajesadministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-mensaje style="align-self: stretch;"></vista-mensaje>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-mensajesadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaMensajesadministrador.is, VistaMensajesadministrador);
