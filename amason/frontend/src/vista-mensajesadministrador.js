import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-mensajesadministrador`
 *
 * VistaMensajesadministrador element.
 *
 * @customElement
 * @polymer
 */
class VistaMensajesadministrador extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
